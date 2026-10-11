package defpackage;

import android.text.PrecomputedText;
import android.text.Spannable;
import android.text.SpannableString;
import java.util.stream.IntStream;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class jo6 implements Spannable {
    public boolean x = false;
    public Spannable y;

    public jo6(Spannable spannable) {
        this.y = spannable;
    }

    @Override // java.lang.CharSequence
    public final char charAt(int i) {
        return this.y.charAt(i);
    }

    @Override // java.lang.CharSequence
    public final IntStream chars() {
        return this.y.chars();
    }

    @Override // java.lang.CharSequence
    public final IntStream codePoints() {
        return this.y.codePoints();
    }

    @Override // android.text.Spanned
    public final int getSpanEnd(Object obj) {
        return this.y.getSpanEnd(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanFlags(Object obj) {
        return this.y.getSpanFlags(obj);
    }

    @Override // android.text.Spanned
    public final int getSpanStart(Object obj) {
        return this.y.getSpanStart(obj);
    }

    @Override // android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        return this.y.getSpans(i, i2, cls);
    }

    @Override // java.lang.CharSequence
    public final int length() {
        return this.y.length();
    }

    @Override // android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return this.y.nextSpanTransition(i, i2, cls);
    }

    @Override // android.text.Spannable
    public final void removeSpan(Object obj) {
        Spannable spannable = this.y;
        if (!this.x && (spannable instanceof PrecomputedText)) {
            SpannableString spannableString = new SpannableString(spannable);
            this.y = spannableString;
            spannable = spannableString;
        }
        this.x = true;
        spannable.removeSpan(obj);
    }

    @Override // android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        Spannable spannable = this.y;
        if (!this.x && (spannable instanceof PrecomputedText)) {
            SpannableString spannableString = new SpannableString(spannable);
            this.y = spannableString;
            spannable = spannableString;
        }
        this.x = true;
        spannable.setSpan(obj, i, i2, i3);
    }

    @Override // java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return this.y.subSequence(i, i2);
    }

    @Override // java.lang.CharSequence
    public final String toString() {
        return this.y.toString();
    }
}
