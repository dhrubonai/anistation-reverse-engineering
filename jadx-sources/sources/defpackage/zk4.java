package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zk4 extends dl4 {
    public al4 D;

    @Override // defpackage.dl4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsKey(Object obj) {
        if (!(obj instanceof jw4)) {
            return false;
        }
        return super.containsKey((jw4) obj);
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final /* bridge */ boolean containsValue(Object obj) {
        if (!(obj instanceof wq6)) {
            return false;
        }
        return super.containsValue((wq6) obj);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [bl4] */
    @Override // defpackage.dl4
    /* renamed from: d, reason: merged with bridge method [inline-methods] and merged with bridge method [inline-methods] */
    public final al4 b() {
        oj6 oj6Var = this.z;
        al4 al4Var = this.D;
        oj6 oj6Var2 = al4Var.x;
        al4 al4Var2 = al4Var;
        if (oj6Var != oj6Var2) {
            this.y = new i18((byte) 25);
            al4Var2 = new bl4(this.z, this.C);
        }
        this.D = al4Var2;
        return al4Var2;
    }

    @Override // defpackage.dl4, java.util.AbstractMap, java.util.Map
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

    @Override // defpackage.dl4, java.util.AbstractMap, java.util.Map
    public final /* bridge */ Object remove(Object obj) {
        if (!(obj instanceof jw4)) {
            return null;
        }
        return (wq6) super.remove((jw4) obj);
    }
}
