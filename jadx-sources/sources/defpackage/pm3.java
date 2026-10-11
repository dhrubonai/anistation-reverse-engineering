package defpackage;

import com.anistation.android.MainActivity;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class pm3 implements sb2 {
    public final /* synthetic */ byte x;
    public final /* synthetic */ MainActivity y;

    public /* synthetic */ pm3(MainActivity mainActivity, byte b) {
        this.x = b;
        this.y = mainActivity;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        byte b = this.x;
        MainActivity mainActivity = this.y;
        switch (b) {
            case 0:
                return w65.B(mainActivity).d(z05.a(kf2.class), null, null);
            default:
                return w65.B(mainActivity).d(z05.a(ch1.class), null, null);
        }
    }
}
