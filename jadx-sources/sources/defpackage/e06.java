package defpackage;

import com.google.protobuf.Internal;
import com.google.protobuf.MessageLite;
import com.google.protobuf.ProtoSyntax;
import com.google.protobuf.n0;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e06 implements yx3 {
    public final ProtoSyntax a;
    public final boolean b;
    public final int[] c;
    public final n0[] d;
    public final MessageLite e;

    public e06(ProtoSyntax protoSyntax, boolean z, int[] iArr, n0[] n0VarArr, Object obj) {
        this.a = protoSyntax;
        this.b = z;
        this.c = iArr;
        this.d = n0VarArr;
        this.e = (MessageLite) Internal.checkNotNull(obj, "defaultInstance");
    }

    @Override // defpackage.yx3
    public final boolean a() {
        return this.b;
    }

    @Override // defpackage.yx3
    public final MessageLite b() {
        return this.e;
    }

    @Override // defpackage.yx3
    public final ProtoSyntax getSyntax() {
        return this.a;
    }
}
