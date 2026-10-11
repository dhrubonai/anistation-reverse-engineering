package defpackage;

import java.util.ArrayList;
import java.util.Collection;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class cs extends t1 {
    public final transient byte D;

    public cs() {
        super(sq0.b(12));
        io3.t(3, "expectedValuesPerKey");
        this.D = (byte) 3;
    }

    @Override // defpackage.t1
    public final Collection m() {
        return new ArrayList(this.D);
    }
}
