package defpackage;

import android.os.Bundle;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class uo7 extends kp7 {
    public final /* synthetic */ byte B;
    public final /* synthetic */ sp7 C;
    public final /* synthetic */ Object D;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uo7(sp7 sp7Var, Exception exc) {
        super(sp7Var, false);
        this.B = (byte) 2;
        this.D = exc;
        this.C = sp7Var;
    }

    @Override // defpackage.kp7
    public final void a() {
        switch (this.B) {
            case 0:
                wn7 wn7Var = this.C.e;
                a34.x(wn7Var);
                wn7Var.setConditionalUserProperty((Bundle) this.D, this.x);
                return;
            case 1:
                wn7 wn7Var2 = this.C.e;
                a34.x(wn7Var2);
                wn7Var2.retrieveAndUploadBatches(new zo7(this, (ly7) this.D));
                return;
            default:
                wn7 wn7Var3 = this.C.e;
                a34.x(wn7Var3);
                wn7Var3.logHealthData(5, "Error with data collection. Data lost.", new ic4((Exception) this.D), new ic4(null), new ic4(null));
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ uo7(sp7 sp7Var, Object obj, byte b) {
        super(sp7Var, true);
        this.B = b;
        this.D = obj;
        this.C = sp7Var;
    }
}
