package defpackage;

import java.util.List;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes2.dex */
public final class i63 implements aj5 {
    public static final i63 b = new i63();
    public static final String c = "kotlinx.serialization.json.JsonObject";
    public final /* synthetic */ xj2 a;

    public i63() {
        mz5 mz5Var = mz5.a;
        u53 u53Var = u53.a;
        aj5 descriptor = mz5Var.getDescriptor();
        aj5 descriptor2 = u53Var.getDescriptor();
        descriptor.getClass();
        descriptor2.getClass();
        this.a = new xj2("kotlin.collections.LinkedHashMap", descriptor, descriptor2);
    }

    @Override // defpackage.aj5
    public final String a() {
        return c;
    }

    @Override // defpackage.aj5
    public final boolean c() {
        return false;
    }

    @Override // defpackage.aj5
    public final int d(String str) {
        str.getClass();
        return this.a.d(str);
    }

    @Override // defpackage.aj5
    public final int e() {
        return 2;
    }

    @Override // defpackage.aj5
    public final String f(int i) {
        return String.valueOf(i);
    }

    @Override // defpackage.aj5
    public final List g(int i) {
        this.a.g(i);
        return nt1.x;
    }

    @Override // defpackage.aj5
    public final List getAnnotations() {
        return nt1.x;
    }

    @Override // defpackage.aj5
    public final hj5 getKind() {
        return f06.c;
    }

    @Override // defpackage.aj5
    public final aj5 h(int i) {
        return this.a.h(i);
    }

    @Override // defpackage.aj5
    public final boolean i(int i) {
        this.a.i(i);
        return false;
    }

    @Override // defpackage.aj5
    public final boolean isInline() {
        return false;
    }
}
