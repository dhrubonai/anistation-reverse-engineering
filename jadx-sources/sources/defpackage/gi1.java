package defpackage;

import android.os.Build;
import android.view.Window;
import com.anistation.android.MainActivity;
import com.anistation.model.settings.ThemeMode;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class gi1 implements sb2 {
    public final /* synthetic */ Object A;
    public final /* synthetic */ byte x = 1;
    public final /* synthetic */ boolean y;
    public final /* synthetic */ Object z;

    public /* synthetic */ gi1(MainActivity mainActivity, boolean z, w44 w44Var) {
        this.z = mainActivity;
        this.y = z;
        this.A = w44Var;
    }

    @Override // defpackage.sb2
    public final Object invoke() {
        w57 w57Var;
        switch (this.x) {
            case 0:
                boolean z = this.y;
                ea5 ea5Var = (ea5) this.z;
                String str = (String) this.A;
                if (z) {
                    rq3 rq3Var = ea5Var.a;
                    synchronized (((og5) rq3Var.f)) {
                    }
                }
                return pn6.a;
            default:
                MainActivity mainActivity = (MainActivity) this.z;
                boolean z2 = this.y;
                w44 w44Var = (w44) this.A;
                int i = MainActivity.B;
                mainActivity.A = (ThemeMode) w44Var.getValue();
                Window window = mainActivity.getWindow();
                fq3 fq3Var = new fq3(mainActivity.getWindow().getDecorView());
                int i2 = Build.VERSION.SDK_INT;
                if (i2 >= 35) {
                    w57Var = new w57(window, fq3Var, (byte) 1);
                } else if (i2 >= 30) {
                    w57Var = new w57(window, fq3Var, (byte) 1);
                } else {
                    w57Var = new w57(window, fq3Var, (byte) 0);
                }
                boolean z3 = !z2;
                w57Var.f(z3);
                w57Var.e(z3);
                return pn6.a;
        }
    }

    public /* synthetic */ gi1(boolean z, ea5 ea5Var, String str) {
        this.y = z;
        this.z = ea5Var;
        this.A = str;
    }
}
