package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class al4 extends bl4 implements yu0 {
    public static final al4 A = new bl4(oj6.e, 0);

    /* JADX WARN: Type inference failed for: r0v0, types: [zk4, dl4] */
    @Override // defpackage.bl4
    public final dl4 a() {
        ?? dl4Var = new dl4(this);
        dl4Var.D = this;
        return dl4Var;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [zk4, dl4] */
    @Override // defpackage.bl4
    public final dl4 b() {
        ?? dl4Var = new dl4(this);
        dl4Var.D = this;
        return dl4Var;
    }

    @Override // defpackage.bl4, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof jw4)) {
            return false;
        }
        return super.containsKey((jw4) obj);
    }

    @Override // defpackage.bl4, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof wq6)) {
            return false;
        }
        return super.containsValue((wq6) obj);
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [al4, bl4] */
    public final al4 d(jw4 jw4Var, wq6 wq6Var) {
        mn0 u = this.x.u(jw4Var.hashCode(), 0, jw4Var, wq6Var);
        if (u == null) {
            return this;
        }
        return new bl4((oj6) u.y, this.y + (u.x ? 1 : 0));
    }

    @Override // defpackage.bl4, java.util.Map
    public final /* bridge */ Object get(Object obj) {
        if (!(obj instanceof jw4)) {
            return null;
        }
        return (wq6) super.get((jw4) obj);
    }

    @Override // java.util.Map
    public final /* bridge */ Object getOrDefault(Object obj, Object obj2) {
        if (!(obj instanceof jw4)) {
            return obj2;
        }
        return (wq6) super.getOrDefault((jw4) obj, (wq6) obj2);
    }
}
