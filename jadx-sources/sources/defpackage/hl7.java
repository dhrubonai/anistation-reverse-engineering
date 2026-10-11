package defpackage;

import com.google.android.gms.common.api.Status;
import java.util.Objects;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class hl7 implements a55 {
    public final /* synthetic */ byte x = 1;
    public final Status y;

    public hl7(am7 am7Var, Status status) {
        this.y = status;
        Objects.requireNonNull(am7Var);
    }

    @Override // defpackage.a55
    public final Status b() {
        byte b = this.x;
        return this.y;
    }

    public hl7(jl7 jl7Var, Status status) {
        this.y = status;
    }

    public hl7(Status status) {
        this.y = status;
    }
}
