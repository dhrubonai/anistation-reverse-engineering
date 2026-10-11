package m3;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public int f7146a;

    /* renamed from: b, reason: collision with root package name */
    public int f7147b;

    /* renamed from: c, reason: collision with root package name */
    public Object f7148c;

    /* renamed from: d, reason: collision with root package name */
    public int f7149d;

    public a(Object obj, int i10, int i11, int i12) {
        this.f7146a = i10;
        this.f7147b = i11;
        this.f7149d = i12;
        this.f7148c = obj;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        int i10 = this.f7146a;
        if (i10 != aVar.f7146a) {
            return false;
        }
        if (i10 == 8 && Math.abs(this.f7149d - this.f7147b) == 1 && this.f7149d == aVar.f7147b && this.f7147b == aVar.f7149d) {
            return true;
        }
        if (this.f7149d != aVar.f7149d || this.f7147b != aVar.f7147b) {
            return false;
        }
        Object obj2 = this.f7148c;
        if (obj2 != null) {
            if (!obj2.equals(aVar.f7148c)) {
                return false;
            }
        } else if (aVar.f7148c != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.f7146a * 31) + this.f7147b) * 31) + this.f7149d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i10 = this.f7146a;
        if (i10 != 1) {
            if (i10 != 2) {
                if (i10 != 4) {
                    if (i10 != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.f7147b);
        sb.append("c:");
        sb.append(this.f7149d);
        sb.append(",p:");
        sb.append(this.f7148c);
        sb.append("]");
        return sb.toString();
    }
}
