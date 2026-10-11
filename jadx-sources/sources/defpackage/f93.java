package defpackage;

import java.nio.charset.Charset;
import java.util.Iterator;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class f93 extends xz0 {
    public Iterator A;
    public /* synthetic */ Object B;
    public final /* synthetic */ k93 C;
    public int D;
    public Charset x;
    public vk6 y;
    public oa0 z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f93(k93 k93Var, xz0 xz0Var) {
        super(xz0Var);
        this.C = k93Var;
    }

    @Override // defpackage.h30
    public final Object invokeSuspend(Object obj) {
        this.B = obj;
        this.D |= Integer.MIN_VALUE;
        return this.C.b(null, null, null, this);
    }
}
