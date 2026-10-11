package l7;

/* loaded from: classes.dex */
public class d implements Iterable {

    /* renamed from: a, reason: collision with root package name */
    public final int f6882a;

    /* renamed from: b, reason: collision with root package name */
    public final int f6883b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6884c;

    public d(int i10, int i11, int i12) {
        if (i12 != 0) {
            if (i12 != Integer.MIN_VALUE) {
                this.f6882a = i10;
                this.f6883b = com.bumptech.glide.d.C(i10, i11, i12);
                this.f6884c = i12;
                return;
            }
            throw new IllegalArgumentException("Step must be greater than Int.MIN_VALUE to avoid overflow on negation.");
        }
        throw new IllegalArgumentException("Step must be non-zero.");
    }

    @Override // java.lang.Iterable
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public final e iterator() {
        return new e(this.f6882a, this.f6883b, this.f6884c);
    }

    public boolean equals(Object obj) {
        if (obj instanceof d) {
            if (!isEmpty() || !((d) obj).isEmpty()) {
                d dVar = (d) obj;
                if (this.f6882a != dVar.f6882a || this.f6883b != dVar.f6883b || this.f6884c != dVar.f6884c) {
                }
            }
            return true;
        }
        return false;
    }

    public int hashCode() {
        if (isEmpty()) {
            return -1;
        }
        return (((this.f6882a * 31) + this.f6883b) * 31) + this.f6884c;
    }

    public boolean isEmpty() {
        int i10 = this.f6884c;
        int i11 = this.f6883b;
        int i12 = this.f6882a;
        if (i10 > 0) {
            if (i12 > i11) {
                return true;
            }
        } else if (i12 < i11) {
            return true;
        }
        return false;
    }

    public String toString() {
        StringBuilder sb;
        int i10 = this.f6883b;
        int i11 = this.f6882a;
        int i12 = this.f6884c;
        if (i12 > 0) {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append("..");
            sb.append(i10);
            sb.append(" step ");
            sb.append(i12);
        } else {
            sb = new StringBuilder();
            sb.append(i11);
            sb.append(" downTo ");
            sb.append(i10);
            sb.append(" step ");
            sb.append(-i12);
        }
        return sb.toString();
    }
}
