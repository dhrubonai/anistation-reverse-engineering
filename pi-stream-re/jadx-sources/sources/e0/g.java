package e0;

import android.os.Build;
import android.os.LocaleList;
import android.text.PrecomputedText;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;

/* loaded from: classes.dex */
public final class g {

    /* renamed from: a, reason: collision with root package name */
    public final TextPaint f3311a;

    /* renamed from: b, reason: collision with root package name */
    public final TextDirectionHeuristic f3312b;

    /* renamed from: c, reason: collision with root package name */
    public final int f3313c;

    /* renamed from: d, reason: collision with root package name */
    public final int f3314d;

    public g(TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic, int i10, int i11) {
        PrecomputedText.Params.Builder breakStrategy;
        PrecomputedText.Params.Builder hyphenationFrequency;
        PrecomputedText.Params.Builder textDirection;
        if (Build.VERSION.SDK_INT >= 29) {
            breakStrategy = com.google.android.gms.internal.p002firebaseauthapi.a.m(textPaint).setBreakStrategy(i10);
            hyphenationFrequency = breakStrategy.setHyphenationFrequency(i11);
            textDirection = hyphenationFrequency.setTextDirection(textDirectionHeuristic);
            textDirection.build();
        }
        this.f3311a = textPaint;
        this.f3312b = textDirectionHeuristic;
        this.f3313c = i10;
        this.f3314d = i11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:34:0x0080, code lost:
    
        if (r1 == false) goto L10;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0096, code lost:
    
        if (r3.getTypeface() != null) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x009c, code lost:
    
        if (r5.getTypeface() == null) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00b0, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ac, code lost:
    
        if (r3.getTypeface().equals(r5.getTypeface()) != false) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r3.getTextLocale().equals(r5.getTextLocale()) == false) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean equals(java.lang.Object r8) {
        /*
            r7 = this;
            r0 = 1
            if (r8 != r7) goto L4
            return r0
        L4:
            boolean r1 = r8 instanceof e0.g
            r2 = 0
            if (r1 != 0) goto La
            return r2
        La:
            e0.g r8 = (e0.g) r8
            int r1 = android.os.Build.VERSION.SDK_INT
            int r3 = r8.f3313c
            int r4 = r7.f3313c
            if (r4 == r3) goto L17
        L14:
            r1 = r2
            goto Lb1
        L17:
            int r3 = r7.f3314d
            int r4 = r8.f3314d
            if (r3 == r4) goto L1e
            goto L14
        L1e:
            android.text.TextPaint r3 = r7.f3311a
            float r4 = r3.getTextSize()
            android.text.TextPaint r5 = r8.f3311a
            float r6 = r5.getTextSize()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L2f
            goto L14
        L2f:
            float r4 = r3.getTextScaleX()
            float r6 = r5.getTextScaleX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L3c
            goto L14
        L3c:
            float r4 = r3.getTextSkewX()
            float r6 = r5.getTextSkewX()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L49
            goto L14
        L49:
            float r4 = r3.getLetterSpacing()
            float r6 = r5.getLetterSpacing()
            int r4 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r4 == 0) goto L56
            goto L14
        L56:
            java.lang.String r4 = r3.getFontFeatureSettings()
            java.lang.String r6 = r5.getFontFeatureSettings()
            boolean r4 = android.text.TextUtils.equals(r4, r6)
            if (r4 != 0) goto L65
            goto L14
        L65:
            int r4 = r3.getFlags()
            int r6 = r5.getFlags()
            if (r4 == r6) goto L70
            goto L14
        L70:
            r4 = 24
            if (r1 < r4) goto L83
            android.os.LocaleList r1 = a6.a.g(r3)
            android.os.LocaleList r4 = a6.a.g(r5)
            boolean r1 = a6.a.y(r4, r1)
            if (r1 != 0) goto L92
            goto L14
        L83:
            java.util.Locale r1 = r3.getTextLocale()
            java.util.Locale r4 = r5.getTextLocale()
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L92
            goto L14
        L92:
            android.graphics.Typeface r1 = r3.getTypeface()
            if (r1 != 0) goto La0
            android.graphics.Typeface r1 = r5.getTypeface()
            if (r1 == 0) goto Lb0
            goto L14
        La0:
            android.graphics.Typeface r1 = r3.getTypeface()
            android.graphics.Typeface r3 = r5.getTypeface()
            boolean r1 = r1.equals(r3)
            if (r1 != 0) goto Lb0
            goto L14
        Lb0:
            r1 = r0
        Lb1:
            if (r1 != 0) goto Lb4
            return r2
        Lb4:
            android.text.TextDirectionHeuristic r1 = r7.f3312b
            android.text.TextDirectionHeuristic r8 = r8.f3312b
            if (r1 == r8) goto Lbb
            return r2
        Lbb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: e0.g.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        LocaleList textLocales;
        int i10 = Build.VERSION.SDK_INT;
        int i11 = this.f3314d;
        int i12 = this.f3313c;
        TextDirectionHeuristic textDirectionHeuristic = this.f3312b;
        TextPaint textPaint = this.f3311a;
        if (i10 >= 24) {
            textLocales = textPaint.getTextLocales();
            return f0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textLocales, textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
        }
        return f0.b.b(Float.valueOf(textPaint.getTextSize()), Float.valueOf(textPaint.getTextScaleX()), Float.valueOf(textPaint.getTextSkewX()), Float.valueOf(textPaint.getLetterSpacing()), Integer.valueOf(textPaint.getFlags()), textPaint.getTextLocale(), textPaint.getTypeface(), Boolean.valueOf(textPaint.isElegantTextHeight()), textDirectionHeuristic, Integer.valueOf(i12), Integer.valueOf(i11));
    }

    public final String toString() {
        String fontVariationSettings;
        LocaleList textLocales;
        StringBuilder sb = new StringBuilder("{");
        StringBuilder sb2 = new StringBuilder("textSize=");
        TextPaint textPaint = this.f3311a;
        sb2.append(textPaint.getTextSize());
        sb.append(sb2.toString());
        sb.append(", textScaleX=" + textPaint.getTextScaleX());
        sb.append(", textSkewX=" + textPaint.getTextSkewX());
        int i10 = Build.VERSION.SDK_INT;
        sb.append(", letterSpacing=" + textPaint.getLetterSpacing());
        sb.append(", elegantTextHeight=" + textPaint.isElegantTextHeight());
        if (i10 >= 24) {
            StringBuilder sb3 = new StringBuilder(", textLocale=");
            textLocales = textPaint.getTextLocales();
            sb3.append(textLocales);
            sb.append(sb3.toString());
        } else {
            sb.append(", textLocale=" + textPaint.getTextLocale());
        }
        sb.append(", typeface=" + textPaint.getTypeface());
        if (i10 >= 26) {
            StringBuilder sb4 = new StringBuilder(", variationSettings=");
            fontVariationSettings = textPaint.getFontVariationSettings();
            sb4.append(fontVariationSettings);
            sb.append(sb4.toString());
        }
        sb.append(", textDir=" + this.f3312b);
        sb.append(", breakStrategy=" + this.f3313c);
        sb.append(", hyphenationFrequency=" + this.f3314d);
        sb.append("}");
        return sb.toString();
    }

    public g(PrecomputedText.Params params) {
        TextPaint textPaint;
        TextDirectionHeuristic textDirection;
        int breakStrategy;
        int hyphenationFrequency;
        textPaint = params.getTextPaint();
        this.f3311a = textPaint;
        textDirection = params.getTextDirection();
        this.f3312b = textDirection;
        breakStrategy = params.getBreakStrategy();
        this.f3313c = breakStrategy;
        hyphenationFrequency = params.getHyphenationFrequency();
        this.f3314d = hyphenationFrequency;
    }
}
