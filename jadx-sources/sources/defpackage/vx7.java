package defpackage;

import android.app.Service;
import android.content.Intent;
import java.util.Map;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final /* synthetic */ class vx7 implements Runnable {
    public final /* synthetic */ Object A;
    public final /* synthetic */ Cloneable B;
    public final /* synthetic */ byte x = 0;
    public final /* synthetic */ int y;
    public final /* synthetic */ Object z;

    public /* synthetic */ vx7(qb7 qb7Var, int i, es7 es7Var, Intent intent) {
        this.z = qb7Var;
        this.y = i;
        this.A = es7Var;
        this.B = intent;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.lang.Runnable
    public final void run() {
        byte b = this.x;
        Object obj = this.B;
        Object obj2 = this.A;
        int i = this.y;
        Object obj3 = this.z;
        switch (b) {
            case 0:
                ((ux7) ((js7) obj3).C).a(i, (Exception) obj2, (byte[]) obj);
                return;
            default:
                es7 es7Var = (es7) obj2;
                Intent intent = (Intent) obj;
                Service service = (Service) ((qb7) obj3).y;
                f08 f08Var = (f08) service;
                if (f08Var.a(i)) {
                    es7Var.K.b(Integer.valueOf(i), "Local AppMeasurementService processed last upload request. StartId");
                    es7 es7Var2 = gu7.q(service, null, null, null).C;
                    gu7.l(es7Var2);
                    es7Var2.K.a("Completed wakeful intent.");
                    f08Var.b(intent);
                    return;
                }
                return;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ vx7(js7 js7Var, int i, Exception exc, byte[] bArr, Map map) {
        this.z = js7Var;
        this.y = i;
        this.A = exc;
        this.B = bArr;
    }
}
