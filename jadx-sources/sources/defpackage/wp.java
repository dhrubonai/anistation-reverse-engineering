package defpackage;

import android.graphics.Typeface;
import android.os.Handler;
import android.os.Looper;
import android.widget.TextView;
import java.lang.Character;
import java.lang.ref.WeakReference;
import java.text.BreakIterator;
import java.util.Arrays;
import java.util.Locale;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class wp {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public Object d;
    public Object e;

    public wp(CharSequence charSequence, int i, Locale locale) {
        this.a = (byte) 5;
        this.d = charSequence;
        if (charSequence.length() < 0) {
            fz2.a("input start index is outside the CharSequence");
        }
        if (i < 0 || i > charSequence.length()) {
            fz2.a("input end index is outside the CharSequence");
        }
        BreakIterator wordInstance = BreakIterator.getWordInstance(locale);
        this.e = wordInstance;
        this.b = Math.max(0, -50);
        this.c = Math.min(charSequence.length(), i + 50);
        wordInstance.setText(new fl0(charSequence, i));
    }

    public synchronized void a(long j, Object obj) {
        if (this.c > 0) {
            if (j <= ((long[]) this.d)[((this.b + r0) - 1) % ((Object[]) this.e).length]) {
                e();
            }
        }
        f();
        int i = this.b;
        int i2 = this.c;
        Object[] objArr = (Object[]) this.e;
        int length = (i + i2) % objArr.length;
        ((long[]) this.d)[length] = j;
        objArr[length] = obj;
        this.c = i2 + 1;
    }

    public bi6 b() {
        return new bi6((String) this.d, (String) this.e, this.b, this.c);
    }

    public void c(final int i) {
        new Handler(Looper.getMainLooper()).post(new Runnable() { // from class: l45
            @Override // java.lang.Runnable
            public final void run() {
                wp.this.o(i);
            }
        });
    }

    public void d(int i) {
        int i2 = this.b;
        int i3 = this.c;
        boolean z = false;
        if (i <= i3 && i2 <= i) {
            z = true;
        }
        if (!z) {
            StringBuilder u = qx1.u("Invalid offset: ", i, ". Valid range is [", i2, " , ");
            u.append(i3);
            u.append("]");
            fz2.a(u.toString());
        }
    }

    public synchronized void e() {
        this.b = 0;
        this.c = 0;
        Arrays.fill((Object[]) this.e, (Object) null);
    }

    public void f() {
        int length = ((Object[]) this.e).length;
        if (this.c < length) {
            return;
        }
        int i = length * 2;
        long[] jArr = new long[i];
        Object[] objArr = new Object[i];
        int i2 = this.b;
        int i3 = length - i2;
        System.arraycopy((long[]) this.d, i2, jArr, 0, i3);
        System.arraycopy((Object[]) this.e, this.b, objArr, 0, i3);
        int i4 = this.b;
        if (i4 > 0) {
            System.arraycopy((long[]) this.d, 0, jArr, i3, i4);
            System.arraycopy((Object[]) this.e, 0, objArr, i3, this.b);
        }
        this.d = jArr;
        this.e = objArr;
        this.b = 0;
    }

    public int g() {
        fd2 fd2Var = (fd2) this.e;
        String str = (String) this.d;
        if (fd2Var == null) {
            return str.length();
        }
        return (fd2Var.b - fd2Var.a()) + (str.length() - (this.c - this.b));
    }

    public boolean h(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointBefore(charSequence, i))) {
                int i3 = i - 1;
                if (!Character.isSurrogate(charSequence.charAt(i3))) {
                    if (ks1.d()) {
                        ks1 a = ks1.a();
                        if (a.c() != 1 || a.b(charSequence, i3) == -1) {
                            return false;
                        }
                    } else {
                        return false;
                    }
                }
            }
            return true;
        }
        return false;
    }

    public boolean i(int i) {
        int i2 = this.b + 1;
        if (i <= this.c && i2 <= i) {
            return rv5.d(Character.codePointBefore((CharSequence) this.d, i));
        }
        return false;
    }

    public boolean j(int i) {
        d(i);
        if (((BreakIterator) this.e).isBoundary(i)) {
            if (!l(i) || !l(i - 1) || !l(i + 1)) {
                if (i <= 0 || i >= ((CharSequence) this.d).length() - 1 || (!k(i) && !k(i + 1))) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return false;
    }

    public boolean k(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = i - 1;
        Character.UnicodeBlock of = Character.UnicodeBlock.of(charSequence.charAt(i2));
        Character.UnicodeBlock unicodeBlock = Character.UnicodeBlock.HIRAGANA;
        if (!a34.i(of, unicodeBlock) || !a34.i(Character.UnicodeBlock.of(charSequence.charAt(i)), Character.UnicodeBlock.KATAKANA)) {
            if (a34.i(Character.UnicodeBlock.of(charSequence.charAt(i)), unicodeBlock) && a34.i(Character.UnicodeBlock.of(charSequence.charAt(i2)), Character.UnicodeBlock.KATAKANA)) {
                return true;
            }
            return false;
        }
        return true;
    }

    public boolean l(int i) {
        CharSequence charSequence = (CharSequence) this.d;
        int i2 = this.b;
        if (i < this.c && i2 <= i) {
            if (!Character.isLetterOrDigit(Character.codePointAt(charSequence, i)) && !Character.isSurrogate(charSequence.charAt(i))) {
                if (ks1.d()) {
                    ks1 a = ks1.a();
                    if (a.c() != 1 || a.b(charSequence, i) == -1) {
                        return false;
                    }
                } else {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public boolean m(int i) {
        int i2 = this.b;
        if (i < this.c && i2 <= i) {
            return rv5.d(Character.codePointAt((CharSequence) this.d, i));
        }
        return false;
    }

    public int n(int i) {
        d(i);
        int following = ((BreakIterator) this.e).following(i);
        if (l(following - 1) && l(following) && !k(following)) {
            return n(following);
        }
        return following;
    }

    public void p(Typeface typeface) {
        boolean z;
        int i = this.b;
        if (i != -1) {
            if ((this.c & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = aq.a(typeface, i, z);
        }
        bq bqVar = (bq) this.e;
        WeakReference weakReference = (WeakReference) this.d;
        if (bqVar.m) {
            bqVar.l = typeface;
            TextView textView = (TextView) weakReference.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = bqVar.j;
                if (isAttachedToWindow) {
                    textView.post(new xp((byte) 0, i2, textView, typeface));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    public Object q(long j, boolean z) {
        Object obj = null;
        long j2 = Long.MAX_VALUE;
        while (this.c > 0) {
            long j3 = j - ((long[]) this.d)[this.b];
            if (j3 < 0 && (z || (-j3) >= j2)) {
                break;
            }
            obj = t();
            j2 = j3;
        }
        return obj;
    }

    public synchronized Object r() {
        Object t;
        if (this.c == 0) {
            t = null;
        } else {
            t = t();
        }
        return t;
    }

    public synchronized Object s(long j) {
        return q(j, true);
    }

    public Object t() {
        boolean z;
        if (this.c > 0) {
            z = true;
        } else {
            z = false;
        }
        io3.B(z);
        Object[] objArr = (Object[]) this.e;
        int i = this.b;
        Object obj = objArr[i];
        objArr[i] = null;
        this.b = (i + 1) % objArr.length;
        this.c--;
        return obj;
    }

    public String toString() {
        switch (this.a) {
            case 1:
                fd2 fd2Var = (fd2) this.e;
                String str = (String) this.d;
                if (fd2Var != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append((CharSequence) str, 0, this.b);
                    sb.append(fd2Var.c, 0, fd2Var.d);
                    char[] cArr = fd2Var.c;
                    int i = fd2Var.e;
                    sb.append(cArr, i, fd2Var.b - i);
                    String str2 = (String) this.d;
                    sb.append((CharSequence) str2, this.c, str2.length());
                    return sb.toString();
                }
                return str;
            default:
                return super.toString();
        }
    }

    public int u(int i) {
        d(i);
        int preceding = ((BreakIterator) this.e).preceding(i);
        if (l(preceding) && h(preceding) && !k(preceding)) {
            return u(preceding);
        }
        return preceding;
    }

    public void v(String str, int i, int i2) {
        if (i > i2) {
            fz2.a("start index must be less than or equal to end index: " + i + " > " + i2);
        }
        if (i < 0) {
            fz2.a("start must be non-negative, but was " + i);
        }
        fd2 fd2Var = (fd2) this.e;
        if (fd2Var == null) {
            int max = Math.max(255, str.length() + 128);
            char[] cArr = new char[max];
            int min = Math.min(i, 64);
            int min2 = Math.min(((String) this.d).length() - i2, 64);
            String str2 = (String) this.d;
            int i3 = i - min;
            str2.getClass();
            str2.getChars(i3, i, cArr, 0);
            String str3 = (String) this.d;
            int i4 = max - min2;
            int i5 = min2 + i2;
            str3.getClass();
            str3.getChars(i2, i5, cArr, i4);
            str.getChars(0, str.length(), cArr, min);
            int length = str.length() + min;
            fd2 fd2Var2 = new fd2((byte) 0);
            fd2Var2.b = max;
            fd2Var2.c = cArr;
            fd2Var2.d = length;
            fd2Var2.e = i4;
            this.e = fd2Var2;
            this.b = i3;
            this.c = i5;
            return;
        }
        int i6 = this.b;
        int i7 = i - i6;
        int i8 = i2 - i6;
        if (i7 >= 0 && i8 <= fd2Var.b - fd2Var.a()) {
            int length2 = str.length() - (i8 - i7);
            if (length2 > fd2Var.a()) {
                int a = length2 - fd2Var.a();
                int i9 = fd2Var.b;
                do {
                    i9 *= 2;
                } while (i9 - fd2Var.b < a);
                char[] cArr2 = new char[i9];
                ms.y0(fd2Var.c, cArr2, 0, 0, fd2Var.d);
                int i10 = fd2Var.b;
                int i11 = fd2Var.e;
                int i12 = i10 - i11;
                int i13 = i9 - i12;
                ms.y0(fd2Var.c, cArr2, i13, i11, i12 + i11);
                fd2Var.c = cArr2;
                fd2Var.b = i9;
                fd2Var.e = i13;
            }
            int i14 = fd2Var.d;
            if (i7 < i14 && i8 <= i14) {
                int i15 = i14 - i8;
                char[] cArr3 = fd2Var.c;
                ms.y0(cArr3, cArr3, fd2Var.e - i15, i8, i14);
                fd2Var.d = i7;
                fd2Var.e -= i15;
            } else if (i7 < i14 && i8 >= i14) {
                fd2Var.e = fd2Var.a() + i8;
                fd2Var.d = i7;
            } else {
                int a2 = fd2Var.a() + i7;
                int a3 = fd2Var.a() + i8;
                int i16 = fd2Var.e;
                char[] cArr4 = fd2Var.c;
                ms.y0(cArr4, cArr4, fd2Var.d, i16, a2);
                i7 = fd2Var.d + (a2 - i16);
                fd2Var.d = i7;
                fd2Var.e = a3;
            }
            str.getChars(0, str.length(), fd2Var.c, i7);
            fd2Var.d = str.length() + fd2Var.d;
            return;
        }
        this.d = toString();
        this.e = null;
        this.b = -1;
        this.c = -1;
        v(str, i, i2);
    }

    public void w(String str) {
        boolean z;
        String n = qy3.n(str);
        if (n != null && !qy3.i(n)) {
            z = false;
        } else {
            z = true;
        }
        io3.p(z, "Not an audio MIME type: %s", n);
        this.d = n;
    }

    public void x(String str) {
        boolean z;
        String n = qy3.n(str);
        if (n != null && !qy3.m(n)) {
            z = false;
        } else {
            z = true;
        }
        io3.p(z, "Not a video MIME type: %s", n);
        this.e = n;
    }

    public synchronized int y() {
        return this.c;
    }

    public void o(int i) {
    }

    public wp() {
        this.a = (byte) 3;
        this.d = new long[10];
        this.e = new Object[10];
    }

    public wp(int i, int i2, float[] fArr, float[] fArr2) {
        this.a = (byte) 2;
        this.b = i;
        io3.n(((long) fArr.length) * 2 == ((long) fArr2.length) * 3);
        this.d = fArr;
        this.e = fArr2;
        this.c = i2;
    }

    public wp(bq bqVar, int i, int i2, WeakReference weakReference) {
        this.a = (byte) 0;
        this.e = bqVar;
        this.b = i;
        this.c = i2;
        this.d = weakReference;
    }
}
