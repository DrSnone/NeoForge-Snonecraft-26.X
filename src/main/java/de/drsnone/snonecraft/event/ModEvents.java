package de.drsnone.snonecraft.event;

import de.drsnone.snonecraft.item.ModItems;
import net.minecraft.core.particles.ParticleTypes;
import net.minecraft.server.level.ServerLevel;
import net.minecraft.world.entity.LivingEntity;
import net.minecraft.world.item.ItemStack;
import net.neoforged.bus.api.SubscribeEvent;
import net.neoforged.fml.common.EventBusSubscriber;
import net.neoforged.neoforge.event.entity.living.LivingIncomingDamageEvent;

@EventBusSubscriber(modid = "snonecraft")
public class ModEvents {

    @SubscribeEvent
    public static void onVampireSwordHit(LivingIncomingDamageEvent event) {
        if (event.getSource().getEntity() instanceof LivingEntity attacker) {
            ItemStack mainHandItem = attacker.getMainHandItem();

            if (mainHandItem.is(ModItems.VAMPIRE_SWORD.get())) {
                float healAmount = 2.0f; // 1 volles Herz

                if (attacker.getHealth() < attacker.getMaxHealth()) {
                    attacker.heal(healAmount);

                    // --- PARTIKEL LOGIK START ---
                    // Wir holen uns die Welt, in der das getroffene Ziel (`event.getEntity()`) steht
                    if (event.getEntity().level() instanceof ServerLevel serverLevel) {

                        // Das getroffene Ziel (das Opfer)
                        LivingEntity target = event.getEntity();

                        // Wir spawnen 10 rote Schadens-Partikel (Heart- oder Damage-Indikatoren)
                        serverLevel.sendParticles(
                                ParticleTypes.DAMAGE_INDICATOR, // Der Partikel-Typ (rote Herzen/Kreuze)
                                target.getX(),                  // X-Koordinate des Ziels
                                target.getY() + 1.0D,           // Y-Koordinate (leicht erhöht auf Brusthöhe)
                                target.getZ(),                  // Z-Koordinate des Ziels
                                10,                             // Anzahl der Partikel
                                0.3D, 0.3D, 0.3D,               // Streuung (Spreizung in X, Y, Z Richtung)
                                0.1D                            // Geschwindigkeit der Partikel
                        );
                    }
                    // --- PARTIKEL LOGIK ENDE ---
                }
            }
        }
    }
}


