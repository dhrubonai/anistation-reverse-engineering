package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.opengl.GLES20;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.appbar.AppBarLayout$BaseBehavior;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes.dex */
public final class d0 implements h0.u {

    /* renamed from: a, reason: collision with root package name */
    public int f440a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final Object f441b;

    /* renamed from: c, reason: collision with root package name */
    public final Object f442c;

    /* renamed from: d, reason: collision with root package name */
    public Object f443d;

    /* renamed from: e, reason: collision with root package name */
    public Object f444e;

    public d0(ImageView imageView) {
        this.f441b = imageView;
    }

    public static void b(int i10, int i11, String str) {
        int glCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(glCreateShader, str);
        GLES20.glCompileShader(glCreateShader);
        boolean z9 = false;
        int[] iArr = {0};
        GLES20.glGetShaderiv(glCreateShader, 35713, iArr, 0);
        if (iArr[0] == 1) {
            z9 = true;
        }
        j5.a.h(GLES20.glGetShaderInfoLog(glCreateShader) + ", source: " + str, z9);
        GLES20.glAttachShader(i10, glCreateShader);
        GLES20.glDeleteShader(glCreateShader);
        j5.a.g();
    }

    @Override // h0.u
    public final boolean a(View view) {
        AppBarLayout$BaseBehavior appBarLayout$BaseBehavior = (AppBarLayout$BaseBehavior) this.f444e;
        a3.g.z(this.f442c);
        int i10 = this.f440a;
        appBarLayout$BaseBehavior.getClass();
        if (i10 != 0) {
            if (i10 < 0) {
                throw null;
            }
            throw null;
        }
        throw null;
    }

    public final void c() {
        boolean z9;
        ImageView imageView = (ImageView) this.f441b;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            v1.a(drawable);
        }
        if (drawable != null) {
            x3 x3Var = (x3) this.f442c;
            boolean z10 = false;
            if (x3Var != null) {
                z9 = true;
            } else {
                z9 = false;
            }
            if (z9) {
                if (((x3) this.f444e) == null) {
                    this.f444e = new x3(0);
                }
                x3 x3Var2 = (x3) this.f444e;
                x3Var2.f707d = null;
                x3Var2.f706c = false;
                x3Var2.f708e = null;
                x3Var2.f705b = false;
                ColorStateList a10 = k0.f.a(imageView);
                if (a10 != null) {
                    x3Var2.f706c = true;
                    x3Var2.f707d = a10;
                }
                PorterDuff.Mode b10 = k0.f.b(imageView);
                if (b10 != null) {
                    x3Var2.f705b = true;
                    x3Var2.f708e = b10;
                }
                if (x3Var2.f706c || x3Var2.f705b) {
                    x.e(drawable, x3Var2, imageView.getDrawableState());
                    z10 = true;
                }
                if (z10) {
                    return;
                }
            }
            x3 x3Var3 = (x3) this.f443d;
            if (x3Var3 != null) {
                x.e(drawable, x3Var3, imageView.getDrawableState());
            } else if (x3Var != null) {
                x.e(drawable, x3Var, imageView.getDrawableState());
            }
        }
    }

    public final int d(String str) {
        int glGetAttribLocation = GLES20.glGetAttribLocation(this.f440a, str);
        GLES20.glEnableVertexAttribArray(glGetAttribLocation);
        j5.a.g();
        return glGetAttribLocation;
    }

    public final void e(AttributeSet attributeSet, int i10) {
        int i11;
        Object obj = this.f441b;
        ImageView imageView = (ImageView) obj;
        Context context = imageView.getContext();
        int[] iArr = e.a.f3275f;
        o3 m5 = o3.m(context, attributeSet, iArr, i10);
        g0.y0.k(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) m5.f598b, i10);
        try {
            Drawable drawable = ((ImageView) obj).getDrawable();
            if (drawable == null && (i11 = m5.i(1, -1)) != -1 && (drawable = w7.b.G(((ImageView) obj).getContext(), i11)) != null) {
                ((ImageView) obj).setImageDrawable(drawable);
            }
            if (drawable != null) {
                v1.a(drawable);
            }
            if (m5.l(2)) {
                k0.f.c((ImageView) obj, m5.b(2));
            }
            if (m5.l(3)) {
                k0.f.d((ImageView) obj, v1.b(m5.h(3, -1), null));
            }
        } finally {
            m5.p();
        }
    }

    public final void f(int i10) {
        Object obj = this.f441b;
        if (i10 != 0) {
            ImageView imageView = (ImageView) obj;
            Drawable G = w7.b.G(imageView.getContext(), i10);
            if (G != null) {
                v1.a(G);
            }
            imageView.setImageDrawable(G);
        } else {
            ((ImageView) obj).setImageDrawable(null);
        }
        c();
    }

    public final void g(ColorStateList colorStateList) {
        if (((x3) this.f443d) == null) {
            this.f443d = new x3(0);
        }
        x3 x3Var = (x3) this.f443d;
        x3Var.f707d = colorStateList;
        x3Var.f706c = true;
        c();
    }

    public final void h(PorterDuff.Mode mode) {
        if (((x3) this.f443d) == null) {
            this.f443d = new x3(0);
        }
        x3 x3Var = (x3) this.f443d;
        x3Var.f708e = mode;
        x3Var.f705b = true;
        c();
    }

    public d0(String str, String str2) {
        byte[] bArr;
        byte[] bArr2;
        j5.a.g();
        b(this.f440a, 35633, str);
        b(this.f440a, 35632, str2);
        GLES20.glLinkProgram(this.f440a);
        int[] iArr = {0};
        GLES20.glGetProgramiv(this.f440a, 35714, iArr, 0);
        int i10 = 1;
        j5.a.h("Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(this.f440a), iArr[0] == 1);
        GLES20.glUseProgram(this.f440a);
        this.f443d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(this.f440a, 35721, iArr2, 0);
        this.f441b = new d0.h[iArr2[0]];
        int i11 = 0;
        while (i11 < iArr2[0]) {
            int i12 = this.f440a;
            int[] iArr3 = new int[i10];
            GLES20.glGetProgramiv(i12, 35722, iArr3, 0);
            int i13 = iArr3[0];
            byte[] bArr3 = new byte[i13];
            GLES20.glGetActiveAttrib(i12, i11, i13, new int[i10], 0, new int[i10], 0, new int[i10], 0, bArr3, 0);
            int i14 = 0;
            while (true) {
                if (i14 >= i13) {
                    bArr2 = bArr3;
                    i14 = i13;
                    break;
                } else {
                    bArr2 = bArr3;
                    if (bArr2[i14] == 0) {
                        break;
                    }
                    i14++;
                    bArr3 = bArr2;
                }
            }
            String str3 = new String(bArr2, 0, i14);
            d0.h hVar = new d0.h(str3, GLES20.glGetAttribLocation(i12, str3));
            ((d0.h[]) this.f441b)[i11] = hVar;
            ((Map) this.f443d).put((String) hVar.f3027b, hVar);
            i11++;
            i10 = 1;
        }
        this.f444e = new HashMap();
        int i15 = 1;
        int[] iArr4 = new int[1];
        GLES20.glGetProgramiv(this.f440a, 35718, iArr4, 0);
        this.f442c = new f1.f[iArr4[0]];
        int i16 = 0;
        while (i16 < iArr4[0]) {
            int i17 = this.f440a;
            int[] iArr5 = new int[i15];
            GLES20.glGetProgramiv(i17, 35719, iArr5, 0);
            int[] iArr6 = new int[i15];
            int i18 = iArr5[0];
            byte[] bArr4 = new byte[i18];
            GLES20.glGetActiveUniform(i17, i16, i18, new int[i15], 0, new int[i15], 0, iArr6, 0, bArr4, 0);
            int i19 = 0;
            while (true) {
                if (i19 >= i18) {
                    bArr = bArr4;
                    i19 = i18;
                    break;
                } else {
                    bArr = bArr4;
                    if (bArr[i19] == 0) {
                        break;
                    }
                    i19++;
                    bArr4 = bArr;
                }
            }
            String str4 = new String(bArr, 0, i19);
            f1.f fVar = new f1.f(str4, GLES20.glGetUniformLocation(i17, str4), iArr6[0]);
            ((f1.f[]) this.f442c)[i16] = fVar;
            ((Map) this.f444e).put(str4, fVar);
            i16++;
            i15 = 1;
        }
        j5.a.g();
    }
}
