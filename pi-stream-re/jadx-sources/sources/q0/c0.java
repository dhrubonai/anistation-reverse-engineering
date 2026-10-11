package q0;

import android.os.Build;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* loaded from: classes.dex */
public final class c0 implements Spannable {

    /* renamed from: a, reason: collision with root package name */
    public boolean f8912a = false;

    /* renamed from: b, reason: collision with root package name */
    public Spannable f8913b;

    public c0(Spannable spannable) {
        this.f8913b = spannable;
    }

    public final void a() {
        j6.e b0Var;
        Spannable spannable = this.f8913b;
        if (!this.f8912a) {
            if (Build.VERSION.SDK_INT < 28) {
                b0Var = new j6.e(11);
            } else {
                b0Var = new b0();
            }
            if (b0Var.t(spannable)) {
                this.f8913b = new SpannableString(spannable);
            }
        }
        this.f8912a = true;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i10) {
        return this.f8913b.charAt(i10);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        IntStream chars;
        chars = this.f8913b.chars();
        return chars;
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        IntStream codePoints;
        codePoints = this.f8913b.codePoints();
        return codePoints;
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.f8913b.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.f8913b.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.f8913b.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i10, int i11, Class cls) {
        return this.f8913b.getSpans(i10, i11, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.f8913b.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i10, int i11, Class cls) {
        return this.f8913b.nextSpanTransition(i10, i11, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        a();
        this.f8913b.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i10, int i11, int i12) {
        a();
        this.f8913b.setSpan(obj, i10, i11, i12);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i10, int i11) {
        return this.f8913b.subSequence(i10, i11);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.f8913b.toString();
    }

    public c0(CharSequence charSequence) {
        this.f8913b = new SpannableString(charSequence);
    }
}
