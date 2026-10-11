package n;

import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import m3.k0;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public int f7873a;

    /* renamed from: b, reason: collision with root package name */
    public int f7874b;

    /* renamed from: c, reason: collision with root package name */
    public int[] f7875c;

    /* renamed from: d, reason: collision with root package name */
    public int f7876d;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public g(int i10) {
        this();
        if (i10 != 1) {
        }
    }

    public final void a(int i10) {
        int[] iArr = this.f7875c;
        int i11 = this.f7874b;
        iArr[i11] = i10;
        int i12 = this.f7876d & (i11 + 1);
        this.f7874b = i12;
        int i13 = this.f7873a;
        if (i12 == i13) {
            int length = iArr.length;
            int i14 = length - i13;
            int i15 = length << 1;
            if (i15 >= 0) {
                int[] iArr2 = new int[i15];
                System.arraycopy(iArr, i13, iArr2, 0, i14);
                System.arraycopy(this.f7875c, 0, iArr2, i14, this.f7873a);
                this.f7875c = iArr2;
                this.f7873a = 0;
                this.f7874b = length;
                this.f7876d = i15 - 1;
                return;
            }
            throw new RuntimeException("Max array capacity exceeded");
        }
    }

    public final void b(int i10, int i11) {
        if (i10 >= 0) {
            if (i11 >= 0) {
                int i12 = this.f7876d * 2;
                int[] iArr = this.f7875c;
                if (iArr == null) {
                    int[] iArr2 = new int[4];
                    this.f7875c = iArr2;
                    Arrays.fill(iArr2, -1);
                } else if (i12 >= iArr.length) {
                    int[] iArr3 = new int[i12 * 2];
                    this.f7875c = iArr3;
                    System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
                }
                int[] iArr4 = this.f7875c;
                iArr4[i12] = i10;
                iArr4[i12 + 1] = i11;
                this.f7876d++;
                return;
            }
            throw new IllegalArgumentException("Pixel distance must be non-negative");
        }
        throw new IllegalArgumentException("Layout positions must be non-negative");
    }

    public final void c(RecyclerView recyclerView, boolean z9) {
        boolean z10 = false;
        this.f7876d = 0;
        int[] iArr = this.f7875c;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        k0 k0Var = recyclerView.E;
        if (recyclerView.D != null && k0Var != null && k0Var.f7286i) {
            if (z9) {
                if (!recyclerView.f1236e.g()) {
                    k0Var.i(recyclerView.D.a(), this);
                }
            } else {
                if (!recyclerView.L || recyclerView.T || recyclerView.f1236e.g()) {
                    z10 = true;
                }
                if (!z10) {
                    k0Var.h(this.f7873a, this.f7874b, recyclerView.f1258x0, this);
                }
            }
            int i10 = this.f7876d;
            if (i10 > k0Var.f7287j) {
                k0Var.f7287j = i10;
                k0Var.f7288k = z9;
                recyclerView.f1232c.n();
            }
        }
    }

    public g() {
        int highestOneBit = Integer.bitCount(8) != 1 ? Integer.highestOneBit(7) << 1 : 8;
        this.f7876d = highestOneBit - 1;
        this.f7875c = new int[highestOneBit];
    }
}
