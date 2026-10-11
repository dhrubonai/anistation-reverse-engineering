package c;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.SparseArray;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.o3;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.datepicker.n;
import d2.q;
import f1.b0;
import f1.t;
import g0.k2;
import g0.y;
import java.util.ArrayList;
import java.util.Arrays;
import s.m;

/* loaded from: classes.dex */
public final class j implements d2.h, y {

    /* renamed from: a, reason: collision with root package name */
    public int f1594a;

    /* renamed from: b, reason: collision with root package name */
    public int f1595b;

    /* renamed from: c, reason: collision with root package name */
    public Object f1596c;

    /* renamed from: d, reason: collision with root package name */
    public Object f1597d;

    public j() {
        this(10, 3);
    }

    @Override // d2.h
    public final void E() {
        t tVar = (t) this.f1597d;
        byte[] bArr = b0.f3804f;
        tVar.getClass();
        tVar.E(bArr, bArr.length);
    }

    public final synchronized void a(Object obj, long j4) {
        if (this.f1595b > 0) {
            if (j4 <= ((long[]) this.f1596c)[((this.f1594a + r0) - 1) % ((Object[]) this.f1597d).length]) {
                b();
            }
        }
        c();
        int i10 = this.f1594a;
        int i11 = this.f1595b;
        Object obj2 = this.f1597d;
        int length = (i10 + i11) % ((Object[]) obj2).length;
        ((long[]) this.f1596c)[length] = j4;
        ((Object[]) obj2)[length] = obj;
        this.f1595b = i11 + 1;
    }

    public final synchronized void b() {
        this.f1594a = 0;
        this.f1595b = 0;
        Arrays.fill((Object[]) this.f1597d, (Object) null);
    }

    public final void c() {
        int length = ((Object[]) this.f1597d).length;
        if (this.f1595b < length) {
            return;
        }
        int i10 = length * 2;
        long[] jArr = new long[i10];
        Object[] objArr = new Object[i10];
        int i11 = this.f1594a;
        int i12 = length - i11;
        System.arraycopy((long[]) this.f1596c, i11, jArr, 0, i12);
        System.arraycopy((Object[]) this.f1597d, this.f1594a, objArr, 0, i12);
        int i13 = this.f1594a;
        if (i13 > 0) {
            System.arraycopy((long[]) this.f1596c, 0, jArr, i12, i13);
            System.arraycopy((Object[]) this.f1597d, 0, objArr, i12, this.f1594a);
        }
        this.f1596c = jArr;
        this.f1597d = objArr;
        this.f1594a = 0;
    }

    public final Object d(long j4, boolean z9) {
        Object obj = null;
        long j10 = Long.MAX_VALUE;
        while (this.f1595b > 0) {
            long j11 = j4 - ((long[]) this.f1596c)[this.f1594a];
            if (j11 < 0 && (z9 || (-j11) >= j10)) {
                break;
            }
            obj = g();
            j10 = j11;
        }
        return obj;
    }

    public final synchronized Object e() {
        Object g10;
        if (this.f1595b == 0) {
            g10 = null;
        } else {
            g10 = g();
        }
        return g10;
    }

    public final synchronized Object f(long j4) {
        return d(j4, true);
    }

    public final Object g() {
        boolean z9;
        if (this.f1595b > 0) {
            z9 = true;
        } else {
            z9 = false;
        }
        w7.b.u(z9);
        Object obj = this.f1597d;
        int i10 = this.f1594a;
        Object obj2 = ((Object[]) obj)[i10];
        ((Object[]) obj)[i10] = null;
        this.f1594a = (i10 + 1) % ((Object[]) obj).length;
        this.f1595b--;
        return obj2;
    }

    public final synchronized int h() {
        return this.f1595b;
    }

    @Override // g0.y
    public final k2 o(View view, k2 k2Var) {
        int i10 = k2Var.a(7).f11857b;
        if (this.f1594a >= 0) {
            ((View) this.f1596c).getLayoutParams().height = this.f1594a + i10;
            View view2 = (View) this.f1596c;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        View view3 = (View) this.f1596c;
        view3.setPadding(view3.getPaddingLeft(), this.f1595b + i10, ((View) this.f1596c).getPaddingRight(), ((View) this.f1596c).getPaddingBottom());
        return k2Var;
    }

    @Override // d2.h
    public final d2.g z(q qVar, long j4) {
        long q9 = qVar.q();
        int min = (int) Math.min(this.f1595b, qVar.c() - q9);
        ((t) this.f1597d).D(min);
        qVar.n(((t) this.f1597d).f3858a, 0, min);
        t tVar = (t) this.f1597d;
        int i10 = tVar.f3860c;
        long j10 = -1;
        long j11 = -1;
        long j12 = -9223372036854775807L;
        while (true) {
            int i11 = tVar.f3860c;
            int i12 = tVar.f3859b;
            if (i11 - i12 < 188) {
                break;
            }
            byte[] bArr = tVar.f3858a;
            while (i12 < i10 && bArr[i12] != 71) {
                i12++;
            }
            int i13 = i12 + 188;
            if (i13 > i10) {
                break;
            }
            long V = j5.a.V(i12, this.f1594a, tVar);
            if (V != -9223372036854775807L) {
                long b10 = ((f1.y) this.f1596c).b(V);
                if (b10 > j4) {
                    if (j12 == -9223372036854775807L) {
                        return new d2.g(-1, b10, q9);
                    }
                    return d2.g.b(q9 + j11);
                }
                if (100000 + b10 > j4) {
                    return d2.g.b(q9 + i12);
                }
                j12 = b10;
                j11 = i12;
            }
            tVar.G(i13);
            j10 = i13;
        }
        if (j12 != -9223372036854775807L) {
            return new d2.g(-2, j12, q9 + j10);
        }
        return d2.g.f3140d;
    }

    public j(int i10, int i11) {
        if (i11 != 6) {
            this.f1596c = new long[i10];
            this.f1597d = new Object[i10];
        } else {
            this.f1596c = new w2.q[i10];
            this.f1595b = 0;
        }
    }

    public j(int i10, f1.y yVar, int i11) {
        this.f1594a = i10;
        this.f1596c = yVar;
        this.f1595b = i11;
        this.f1597d = new t();
    }

    public j(Context context, XmlResourceParser xmlResourceParser) {
        this.f1596c = new ArrayList();
        this.f1595b = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), s.q.f9720g);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i10 = 0; i10 < indexCount; i10++) {
            int index = obtainStyledAttributes.getIndex(i10);
            if (index == 0) {
                this.f1594a = obtainStyledAttributes.getResourceId(index, this.f1594a);
            } else if (index == 1) {
                this.f1595b = obtainStyledAttributes.getResourceId(index, this.f1595b);
                String resourceTypeName = context.getResources().getResourceTypeName(this.f1595b);
                context.getResources().getResourceName(this.f1595b);
                if ("layout".equals(resourceTypeName)) {
                    m mVar = new m();
                    this.f1597d = mVar;
                    mVar.b((ConstraintLayout) LayoutInflater.from(context).inflate(this.f1595b, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    public j(int i10, float[] fArr, float[] fArr2, int i11) {
        this.f1594a = i10;
        w7.b.g(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.f1596c = fArr;
        this.f1597d = fArr2;
        this.f1595b = i11;
    }

    public j(j jVar) {
        Object obj = jVar.f1596c;
        this.f1594a = ((float[]) obj).length / 3;
        this.f1596c = j5.a.m((float[]) obj);
        this.f1597d = j5.a.m((float[]) jVar.f1597d);
        int i10 = jVar.f1595b;
        if (i10 == 1) {
            this.f1595b = 5;
        } else if (i10 != 2) {
            this.f1595b = 4;
        } else {
            this.f1595b = 6;
        }
    }

    public j(n nVar, int i10, View view, int i11) {
        this.f1597d = nVar;
        this.f1594a = i10;
        this.f1596c = view;
        this.f1595b = i11;
    }

    public j(m6.n nVar, o3 o3Var) {
        this.f1596c = new SparseArray();
        this.f1597d = nVar;
        this.f1594a = o3Var.i(26, 0);
        this.f1595b = o3Var.i(50, 0);
    }
}
