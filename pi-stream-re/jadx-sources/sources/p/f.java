package p;

/* loaded from: classes.dex */
public class f implements f0.c {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8382a;

    /* renamed from: b, reason: collision with root package name */
    public final Object[] f8383b;

    /* renamed from: c, reason: collision with root package name */
    public int f8384c;

    public f(int i10, int i11) {
        this.f8382a = i11;
        if (i11 != 1) {
            if (i10 > 0) {
                this.f8383b = new Object[i10];
                return;
            }
            throw new IllegalArgumentException("The max pool size must be > 0");
        }
        if (i10 > 0) {
            this.f8383b = new Object[i10];
            return;
        }
        throw new IllegalArgumentException("The max pool size must be > 0");
    }

    @Override // f0.c
    public boolean b(Object obj) {
        int i10;
        boolean z9;
        int i11 = this.f8382a;
        Object[] objArr = this.f8383b;
        switch (i11) {
            case 0:
                int i12 = this.f8384c;
                if (i12 >= objArr.length) {
                    return false;
                }
                objArr[i12] = obj;
                this.f8384c = i12 + 1;
                return true;
            default:
                int i13 = 0;
                while (true) {
                    i10 = this.f8384c;
                    if (i13 < i10) {
                        if (objArr[i13] == obj) {
                            z9 = true;
                        } else {
                            i13++;
                        }
                    } else {
                        z9 = false;
                    }
                }
                if (!z9) {
                    if (i10 >= objArr.length) {
                        return false;
                    }
                    objArr[i10] = obj;
                    this.f8384c = i10 + 1;
                    return true;
                }
                throw new IllegalStateException("Already in the pool!");
        }
    }

    @Override // f0.c
    public Object j() {
        int i10 = this.f8382a;
        Object[] objArr = this.f8383b;
        switch (i10) {
            case 0:
                int i11 = this.f8384c;
                if (i11 <= 0) {
                    return null;
                }
                int i12 = i11 - 1;
                Object obj = objArr[i12];
                objArr[i12] = null;
                this.f8384c = i12;
                return obj;
            default:
                int i13 = this.f8384c;
                if (i13 <= 0) {
                    return null;
                }
                int i14 = i13 - 1;
                Object obj2 = objArr[i14];
                objArr[i14] = null;
                this.f8384c = i14;
                return obj2;
        }
    }
}
