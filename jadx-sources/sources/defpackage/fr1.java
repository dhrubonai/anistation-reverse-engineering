package defpackage;

import android.content.res.Resources;
import android.os.Trace;
import android.view.View;
import android.view.Window;
import com.anistation.android.MainActivity;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class fr1 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ Object C;
    public final /* synthetic */ byte x;
    public final /* synthetic */ Object y;
    public final /* synthetic */ Object z;

    public /* synthetic */ fr1(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, byte b) {
        this.x = b;
        this.y = obj;
        this.z = obj2;
        this.A = obj3;
        this.B = obj4;
        this.C = obj5;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.C;
        Object obj2 = this.B;
        Object obj3 = this.A;
        Object obj4 = this.z;
        Object obj5 = this.y;
        switch (b) {
            case 0:
                e46 e46Var = (e46) obj4;
                e46 e46Var2 = (e46) obj3;
                View view = (View) obj;
                Window window = ((MainActivity) obj2).getWindow();
                window.getClass();
                ub2 ub2Var = e46Var.a;
                Resources resources = view.getResources();
                resources.getClass();
                boolean booleanValue = ((Boolean) ub2Var.invoke(resources)).booleanValue();
                ub2 ub2Var2 = e46Var2.a;
                Resources resources2 = view.getResources();
                resources2.getClass();
                ((ir1) obj5).b(e46Var, e46Var2, window, view, booleanValue, ((Boolean) ub2Var2.invoke(resources2)).booleanValue());
                return;
            default:
                String str = (String) obj4;
                sb2 sb2Var = (sb2) obj3;
                v34 v34Var = (v34) obj2;
                wf0 wf0Var = (wf0) obj;
                ((m18) obj5).getClass();
                boolean a = qg6.a();
                if (a) {
                    try {
                        Trace.beginSection(it5.f(str));
                    } finally {
                        if (a) {
                            Trace.endSection();
                        }
                    }
                }
                try {
                    sb2Var.invoke();
                    zf4 zf4Var = cn7.A;
                    v34Var.a(zf4Var);
                    wf0Var.a(zf4Var);
                } catch (Throwable th) {
                    v34Var.a(new xf4(th));
                    wf0Var.b(th);
                }
                if (a) {
                    return;
                } else {
                    return;
                }
        }
    }
}
