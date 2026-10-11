package defpackage;

import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.Spatializer;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public abstract /* synthetic */ class z3 {
    public static /* bridge */ /* synthetic */ int a(Spatializer spatializer) {
        return spatializer.getImmersiveAudioLevel();
    }

    public static /* bridge */ /* synthetic */ Spatializer b(AudioManager audioManager) {
        return audioManager.getSpatializer();
    }

    public static /* bridge */ /* synthetic */ Spatializer c(Object obj) {
        return (Spatializer) obj;
    }

    public static /* bridge */ /* synthetic */ void e(AudioAttributes.Builder builder, int i) {
        builder.setSpatializationBehavior(i);
    }

    public static /* bridge */ /* synthetic */ void f(AudioAttributes.Builder builder, boolean z) {
        builder.setIsContentSpatialized(z);
    }

    public static /* bridge */ /* synthetic */ void g(Spatializer spatializer, uw uwVar, aw5 aw5Var) {
        spatializer.addOnSpatializerStateChangedListener(uwVar, aw5Var);
    }

    public static /* bridge */ /* synthetic */ void h(Spatializer spatializer, aw5 aw5Var) {
        spatializer.removeOnSpatializerStateChangedListener(aw5Var);
    }
}
