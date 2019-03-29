package me.pavva.pokejava;
import org.junit.*;

public class DamageEffectivityTest {

    @Test
    public void testGetVal() {
        Assert.assertEquals(0.0, DamageEffectivity.INEFFECTIVE.getVal(), 0.01);
        Assert.assertEquals(0.5, DamageEffectivity.NOT_EFFECTIVE.getVal(), 0.01);
        Assert.assertEquals(1.0, DamageEffectivity.REGULAR.getVal(), 0.01);
        Assert.assertEquals(2.0, DamageEffectivity.SUPER_EFFECTIVE.getVal(), 0.01);
    }

    @Test
    public void testToString() {
        Assert.assertEquals("0.0", DamageEffectivity.INEFFECTIVE.toString());
        Assert.assertEquals("0.5", DamageEffectivity.NOT_EFFECTIVE.toString());
        Assert.assertEquals("1.0", DamageEffectivity.REGULAR.toString());
        Assert.assertEquals("2.0", DamageEffectivity.SUPER_EFFECTIVE.toString());
    }
}