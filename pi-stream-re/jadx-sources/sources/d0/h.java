package d0;

import android.graphics.Bitmap;
import android.media.MediaCodecInfo;
import android.media.MediaCodecList;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import d2.q;
import e4.z;
import f1.t;
import h0.u;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.NoSuchElementException;
import m3.k0;
import m3.k1;
import m3.l0;
import s1.x;
import v3.l;
import x3.e0;
import y8.g0;

/* loaded from: classes.dex */
public final class h implements x, h4.a, u, k1 {

    /* renamed from: a, reason: collision with root package name */
    public int f3026a;

    /* renamed from: b, reason: collision with root package name */
    public Object f3027b;

    public /* synthetic */ h(Object obj, int i10) {
        this.f3027b = obj;
        this.f3026a = i10;
    }

    @Override // h0.u
    public boolean a(View view) {
        ((BottomSheetBehavior) this.f3027b).z(this.f3026a);
        return true;
    }

    @Override // s1.x
    public MediaCodecInfo b(int i10) {
        if (((MediaCodecInfo[]) this.f3027b) == null) {
            this.f3027b = new MediaCodecList(this.f3026a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f3027b)[i10];
    }

    @Override // s1.x
    public boolean c(String str, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureRequired(str);
    }

    @Override // s1.x
    public int d() {
        if (((MediaCodecInfo[]) this.f3027b) == null) {
            this.f3027b = new MediaCodecList(this.f3026a).getCodecInfos();
        }
        return ((MediaCodecInfo[]) this.f3027b).length;
    }

    public void e(long j4) {
        int i10 = this.f3026a;
        Object obj = this.f3027b;
        if (i10 == ((long[]) obj).length) {
            this.f3027b = Arrays.copyOf((long[]) obj, i10 * 2);
        }
        long[] jArr = (long[]) this.f3027b;
        int i11 = this.f3026a;
        this.f3026a = i11 + 1;
        jArr[i11] = j4;
    }

    @Override // h4.a
    public e0 f(e0 e0Var, l lVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) e0Var.get()).compress((Bitmap.CompressFormat) this.f3027b, this.f3026a, byteArrayOutputStream);
        e0Var.e();
        return new z(byteArrayOutputStream.toByteArray());
    }

    @Override // s1.x
    public boolean g(String str, String str2, MediaCodecInfo.CodecCapabilities codecCapabilities) {
        return codecCapabilities.isFeatureSupported(str);
    }

    public long h(int i10) {
        if (i10 >= 0 && i10 < this.f3026a) {
            return ((long[]) this.f3027b)[i10];
        }
        StringBuilder u9 = a3.g.u("Invalid index ", i10, ", size is ");
        u9.append(this.f3026a);
        throw new IndexOutOfBoundsException(u9.toString());
    }

    @Override // s1.x
    public boolean i() {
        return true;
    }

    public int j(View view) {
        int bottom;
        int i10;
        int i11 = this.f3026a;
        Object obj = this.f3027b;
        switch (i11) {
            case 0:
                l0 l0Var = (l0) view.getLayoutParams();
                ((k0) obj).getClass();
                bottom = view.getRight() + ((l0) view.getLayoutParams()).f7295b.right;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var).rightMargin;
                break;
            default:
                l0 l0Var2 = (l0) view.getLayoutParams();
                ((k0) obj).getClass();
                bottom = view.getBottom() + ((l0) view.getLayoutParams()).f7295b.bottom;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var2).bottomMargin;
                break;
        }
        return bottom + i10;
    }

    public int k(View view) {
        int top;
        int i10;
        int i11 = this.f3026a;
        Object obj = this.f3027b;
        switch (i11) {
            case 0:
                l0 l0Var = (l0) view.getLayoutParams();
                ((k0) obj).getClass();
                top = view.getLeft() - ((l0) view.getLayoutParams()).f7295b.left;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var).leftMargin;
                break;
            default:
                l0 l0Var2 = (l0) view.getLayoutParams();
                ((k0) obj).getClass();
                top = view.getTop() - ((l0) view.getLayoutParams()).f7295b.top;
                i10 = ((ViewGroup.MarginLayoutParams) l0Var2).topMargin;
                break;
        }
        return top - i10;
    }

    public int l() {
        int i10;
        int B;
        int i11 = this.f3026a;
        Object obj = this.f3027b;
        switch (i11) {
            case 0:
                k0 k0Var = (k0) obj;
                i10 = k0Var.f7291n;
                B = k0Var.D();
                break;
            default:
                k0 k0Var2 = (k0) obj;
                i10 = k0Var2.o;
                B = k0Var2.B();
                break;
        }
        return i10 - B;
    }

    public boolean m() {
        if (this.f3026a < ((List) this.f3027b).size()) {
            return true;
        }
        return false;
    }

    public g0 n() {
        if (m()) {
            List list = (List) this.f3027b;
            int i10 = this.f3026a;
            this.f3026a = i10 + 1;
            return (g0) list.get(i10);
        }
        throw new NoSuchElementException();
    }

    public long o(q qVar) {
        int i10 = 0;
        qVar.n(((t) this.f3027b).f3858a, 0, 1);
        int i11 = ((t) this.f3027b).f3858a[0] & 255;
        if (i11 == 0) {
            return Long.MIN_VALUE;
        }
        int i12 = 128;
        int i13 = 0;
        while ((i11 & i12) == 0) {
            i12 >>= 1;
            i13++;
        }
        int i14 = i11 & (~i12);
        qVar.n(((t) this.f3027b).f3858a, 1, i13);
        while (i10 < i13) {
            i10++;
            i14 = (((t) this.f3027b).f3858a[i10] & 255) + (i14 << 8);
        }
        this.f3026a = i13 + 1 + this.f3026a;
        return i14;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h(int i10) {
        this();
        if (i10 == 4) {
            this.f3027b = new t(8);
        } else if (i10 != 5) {
        } else {
            this(Bitmap.CompressFormat.JPEG, 100);
        }
    }

    public h() {
        this.f3027b = new long[32];
    }

    public h(ArrayList arrayList) {
        this.f3027b = arrayList;
    }

    public h(int i10, i[] iVarArr) {
        this.f3026a = i10;
        this.f3027b = iVarArr;
    }

    public h(boolean z9, boolean z10) {
        this.f3026a = (z9 || z10) ? 1 : 0;
    }
}
