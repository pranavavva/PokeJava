package me.pavva.pokejava;

public enum DamageEffectivity {
    INEFFECTIVE(0.0),
    NOT_EFFECTIVE(0.5),
    REGULAR(1.0),
    SUPER_EFFECTIVE(2.0);
    
    private Double effectivity;

    private DamageEffectivity(Double effectivity) {
        this.effectivity = effectivity;
    }

    public Double getVal() {
        return this.effectivity;
    }

    @Override
    public String toString() {
        return this.effectivity.toString();
    }

}