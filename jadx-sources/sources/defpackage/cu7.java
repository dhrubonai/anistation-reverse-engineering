package defpackage;

import com.google.android.gms.measurement.internal.AppMeasurementDynamiteService;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cu7 implements Runnable {
    public final /* synthetic */ byte x;
    public final /* synthetic */ bo7 y;
    public final /* synthetic */ AppMeasurementDynamiteService z;

    public /* synthetic */ cu7(AppMeasurementDynamiteService appMeasurementDynamiteService, bo7 bo7Var, byte b) {
        this.x = b;
        this.y = bo7Var;
        this.z = appMeasurementDynamiteService;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z = false;
        switch (this.x) {
            case 0:
                zz7 n = this.z.e.n();
                bo7 bo7Var = this.y;
                n.L();
                n.M();
                n.Z(new t35((Object) n, (y2) n.b0(false), (Object) bo7Var, (byte) 9));
                return;
            default:
                AppMeasurementDynamiteService appMeasurementDynamiteService = this.z;
                i28 i28Var = appMeasurementDynamiteService.e.F;
                gu7.j(i28Var);
                gu7 gu7Var = appMeasurementDynamiteService.e;
                if (gu7Var.V != null && gu7Var.V.booleanValue()) {
                    z = true;
                }
                i28Var.C0(this.y, z);
                return;
        }
    }
}
