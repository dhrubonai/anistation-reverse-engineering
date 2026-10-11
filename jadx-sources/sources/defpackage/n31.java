package defpackage;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class n31 extends p31 {
    public final /* synthetic */ byte y;
    public static final n31 z = new n31("", 0);
    public static final n31 A = new n31("", 1);

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ n31(Comparable comparable, byte b) {
        super(comparable);
        this.y = b;
    }

    @Override // defpackage.p31
    /* renamed from: a */
    public int compareTo(p31 p31Var) {
        switch (this.y) {
            case 0:
                if (p31Var == this) {
                    return 0;
                }
                return 1;
            case 1:
                if (p31Var == this) {
                    return 0;
                }
                return -1;
            default:
                return super.compareTo(p31Var);
        }
    }

    @Override // defpackage.p31
    public final void b(StringBuilder sb) {
        switch (this.y) {
            case 0:
                throw new AssertionError();
            case 1:
                sb.append("(-∞");
                return;
            default:
                sb.append('[');
                sb.append(this.x);
                return;
        }
    }

    @Override // defpackage.p31
    public final void c(StringBuilder sb) {
        switch (this.y) {
            case 0:
                sb.append("+∞)");
                return;
            case 1:
                throw new AssertionError();
            default:
                sb.append(this.x);
                sb.append(')');
                return;
        }
    }

    @Override // defpackage.p31, java.lang.Comparable
    public int compareTo(Object obj) {
        switch (this.y) {
            case 0:
                if (((p31) obj) == this) {
                    return 0;
                }
                return 1;
            case 1:
                if (((p31) obj) == this) {
                    return 0;
                }
                return -1;
            default:
                return super.compareTo(obj);
        }
    }

    @Override // defpackage.p31
    public Comparable d() {
        switch (this.y) {
            case 0:
                throw new IllegalStateException("range unbounded on this side");
            case 1:
                throw new IllegalStateException("range unbounded on this side");
            default:
                return super.d();
        }
    }

    @Override // defpackage.p31
    public final boolean e(Comparable comparable) {
        switch (this.y) {
            case 0:
                return false;
            case 1:
                return true;
            default:
                int i = wx4.z;
                if (this.x.compareTo(comparable) > 0) {
                    return false;
                }
                return true;
        }
    }

    @Override // defpackage.p31
    public final int hashCode() {
        switch (this.y) {
            case 0:
                return System.identityHashCode(this);
            case 1:
                return System.identityHashCode(this);
            default:
                return this.x.hashCode();
        }
    }

    public final String toString() {
        switch (this.y) {
            case 0:
                return "+∞";
            case 1:
                return "-∞";
            default:
                return "\\" + this.x + "/";
        }
    }
}
