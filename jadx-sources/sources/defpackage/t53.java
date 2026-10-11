package defpackage;

import com.anistation.model.MediaStatus;
import java.util.UUID;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class t53 implements sb2 {
    public final /* synthetic */ byte x;

    public /* synthetic */ t53(byte b) {
        this.x = b;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        x73 _init_$_anonymous_;
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return c63.b;
            case 1:
                return j63.b;
            case 2:
                return c53.b;
            case 3:
                throw new IllegalStateException("should not be used in favor of LocalKoinScopeContext");
            case 4:
                throw new IllegalStateException("should not be used in favor of getKoin()");
            case 5:
                kz kzVar = p7.L;
                if (kzVar != null) {
                    return new dt0((dc5) ((zp2) kzVar.z).A, new t53((byte) 7));
                }
                ze0.m("KoinApplication has not been started");
                return null;
            case 6:
                kz kzVar2 = p7.L;
                if (kzVar2 != null) {
                    return new dt0(kzVar2, new t53((byte) 8));
                }
                ze0.m("KoinApplication has not been started");
                return null;
            case 7:
                kz kzVar3 = p7.L;
                if (kzVar3 != null) {
                    return (dc5) ((zp2) kzVar3.z).A;
                }
                ze0.m("KoinApplication has not been started");
                return null;
            case 8:
                kz kzVar4 = p7.L;
                if (kzVar4 != null) {
                    return kzVar4;
                }
                ze0.m("KoinApplication has not been started");
                return null;
            case 9:
                return new za3(3);
            case 10:
                return new wc3(0, 0);
            case 11:
                return new af3(0, 0);
            case 12:
                return null;
            case 13:
                return jt.a;
            case 14:
                return tt.a;
            case 15:
                throw new IllegalStateException("CompositionLocal LocalLifecycleOwner not present");
            case 16:
                throw new IllegalStateException("Unexpected access to LocalNavAnimatedContentScope. You should only access LocalNavAnimatedContentScope inside a NavEntry passed to NavDisplay. AnimatedContentScope in OverlayScenes are no-op.");
            case 17:
                return null;
            case 18:
                tq1 tq1Var = bk3.a;
                return ba2.a;
            case 19:
                throw new IllegalStateException("CompositionLocal LocalSavedStateRegistryOwner not present");
            case 20:
                return Boolean.FALSE;
            case 21:
                return y04.a;
            case 22:
                _init_$_anonymous_ = MediaStatus._init_$_anonymous_();
                return _init_$_anonymous_;
            case 23:
                return UUID.randomUUID();
            case 24:
            case 25:
            case 26:
                return pn6Var;
            case 27:
                ke0 b2 = db.b(it1.x);
                db.t(b2, null);
                return b2;
            case 28:
                return df0.a;
            default:
                return fn6.a;
        }
    }
}
