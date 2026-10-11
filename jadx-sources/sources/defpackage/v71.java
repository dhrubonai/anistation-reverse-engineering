package defpackage;

import com.discord.org.webrtc.EglThread;
import com.google.firebase.concurrent.ExecutorsRegistrar;
import com.google.firebase.installations.FirebaseInstallationsRegistrar;
import com.unity3d.ads.adplayer.FullScreenWebViewDisplay;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.lang.reflect.Constructor;
import java.util.Set;
import java.util.concurrent.ScheduledExecutorService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class v71 implements ld6, ky3, es0, wp1, ar1, EglThread.ReleaseMonitor, ri3, v4 {
    public final /* synthetic */ byte x;

    public /* synthetic */ v71(byte b) {
        this.x = b;
    }

    public static /* synthetic */ void e() {
        throw new er0((byte) 3);
    }

    public static /* synthetic */ void g(Object obj, String str) {
        throw new IllegalStateException((str + obj).toString());
    }

    public static /* synthetic */ void i(String str) {
        throw new RuntimeException(str);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void j(String str, int i, int i2) {
        throw new IllegalArgumentException((str + i + ((char) i2)).toString());
    }

    public static /* synthetic */ void k(Object obj, String str) {
        throw new IOException(str + obj);
    }

    public static /* synthetic */ void m(Object obj, String str) {
        throw new FileNotFoundException(str + obj);
    }

    @Override // defpackage.v4
    public void c(Object obj) {
        FullScreenWebViewDisplay.startForResult$lambda$12((u4) obj);
    }

    public Constructor d() {
        switch (this.x) {
            case 1:
                if (!Boolean.TRUE.equals(Class.forName("androidx.media3.decoder.flac.FlacLibrary").getMethod("isAvailable", null).invoke(null, null))) {
                    return null;
                }
                return Class.forName("androidx.media3.decoder.flac.FlacExtractor").asSubclass(b12.class).getConstructor(Integer.TYPE);
            default:
                return Class.forName("androidx.media3.decoder.midi.MidiExtractor").asSubclass(b12.class).getConstructor(null);
        }
    }

    @Override // defpackage.es0
    public Object h(kz kzVar) {
        r32 lambda$getComponents$0;
        switch (this.x) {
            case 6:
                Set d = kzVar.d(px4.a(cy.class));
                af2 af2Var = af2.z;
                if (af2Var == null) {
                    synchronized (af2.class) {
                        try {
                            af2Var = af2.z;
                            if (af2Var == null) {
                                af2Var = new af2((byte) 0);
                                af2.z = af2Var;
                            }
                        } finally {
                        }
                    }
                }
                return new sb1(d, af2Var);
            case 16:
                return (ScheduledExecutorService) ExecutorsRegistrar.a.get();
            case 17:
                return (ScheduledExecutorService) ExecutorsRegistrar.c.get();
            case 18:
                return (ScheduledExecutorService) ExecutorsRegistrar.b.get();
            case 19:
                qb3 qb3Var = ExecutorsRegistrar.a;
                return sm6.x;
            default:
                lambda$getComponents$0 = FirebaseInstallationsRegistrar.lambda$getComponents$0(kzVar);
                return lambda$getComponents$0;
        }
    }

    @Override // defpackage.ri3
    public void invoke(Object obj) {
        ((io4) obj).J(new yx1(2, new gz1(1), 1003));
    }

    @Override // com.discord.org.webrtc.EglThread.ReleaseMonitor
    public boolean onRelease(EglThread eglThread) {
        boolean lambda$create$1;
        lambda$create$1 = EglThread.lambda$create$1(eglThread);
        return lambda$create$1;
    }

    @Override // defpackage.wp1
    public void release() {
    }

    @Override // defpackage.ar1
    public float a(float f) {
        return f;
    }

    @Override // defpackage.ld6
    public void b(c31 c31Var) {
    }

    @Override // defpackage.ky3
    public void f(fy3 fy3Var) {
    }
}
