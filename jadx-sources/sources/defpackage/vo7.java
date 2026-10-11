package defpackage;

import android.os.Bundle;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class vo7 extends kp7 {
    public final /* synthetic */ byte B;
    public final /* synthetic */ String C;
    public final /* synthetic */ String D;
    public final /* synthetic */ Bundle E;
    public final /* synthetic */ sp7 F;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vo7(sp7 sp7Var, String str, String str2, Bundle bundle, byte b) {
        super(sp7Var, true);
        this.B = b;
        switch (b) {
            case 1:
                this.C = str;
                this.D = str2;
                this.E = bundle;
                Objects.requireNonNull(sp7Var);
                this.F = sp7Var;
                super(sp7Var, true);
                return;
            default:
                this.C = str;
                this.D = str2;
                this.E = bundle;
                this.F = sp7Var;
                return;
        }
    }

    @Override // defpackage.kp7
    public final void a() {
        switch (this.B) {
            case 0:
                wn7 wn7Var = this.F.e;
                a34.x(wn7Var);
                wn7Var.clearConditionalUserProperty(this.C, this.D, this.E);
                return;
            default:
                long j = this.x;
                long j2 = this.y;
                wn7 wn7Var2 = this.F.e;
                a34.x(wn7Var2);
                wn7Var2.logEventWithElapsedTime(this.C, this.D, this.E, true, true, j, j2);
                return;
        }
    }
}
