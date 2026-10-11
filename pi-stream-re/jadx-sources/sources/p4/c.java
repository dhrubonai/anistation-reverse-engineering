package p4;

/* loaded from: classes.dex */
public final class c extends n.e {
    public int B;

    @Override // n.k, java.util.Map
    public final void clear() {
        this.B = 0;
        super.clear();
    }

    @Override // n.k, java.util.Map
    public final int hashCode() {
        if (this.B == 0) {
            this.B = super.hashCode();
        }
        return this.B;
    }

    @Override // n.k
    public final void i(n.e eVar) {
        this.B = 0;
        super.i(eVar);
    }

    @Override // n.k
    public final Object j(int i10) {
        this.B = 0;
        return super.j(i10);
    }

    @Override // n.k
    public final Object k(int i10, Object obj) {
        this.B = 0;
        return super.k(i10, obj);
    }

    @Override // n.k, java.util.Map
    public final Object put(Object obj, Object obj2) {
        this.B = 0;
        return super.put(obj, obj2);
    }
}
