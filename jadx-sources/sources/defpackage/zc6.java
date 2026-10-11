package defpackage;

import android.graphics.Paint;
import android.graphics.Rect;
import android.text.Layout;
import android.text.TextPaint;
import android.text.TextUtils;
import java.util.ArrayList;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class zc6 {
    public final TextPaint a;
    public final TextUtils.TruncateAt b;
    public final boolean c;
    public final boolean d;
    public wp e;
    public final Layout f;
    public final int g;
    public final int h;
    public final int i;
    public final float j;
    public final float k;
    public final Paint.FontMetricsInt l;
    public final int m;
    public final mh3[] n;
    public final Rect o = new Rect();
    public kz p;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x021b  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0214  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x020d  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x030d  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x0317  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x018d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public zc6(java.lang.CharSequence r23, float r24, android.text.TextPaint r25, int r26, android.text.TextUtils.TruncateAt r27, int r28, boolean r29, int r30, int r31, int r32, int r33, int r34, int r35, defpackage.na3 r36) {
        /*
            Method dump skipped, instructions count: 826
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zc6.<init>(java.lang.CharSequence, float, android.text.TextPaint, int, android.text.TextUtils$TruncateAt, int, boolean, int, int, int, int, int, int, na3):void");
    }

    public final int a() {
        int height;
        boolean z = this.d;
        Layout layout = this.f;
        if (z) {
            height = layout.getLineBottom(this.g - 1);
        } else {
            height = layout.getHeight();
        }
        return height + this.h + this.i + this.m;
    }

    public final float b(int i) {
        if (i == this.g - 1) {
            return this.j + this.k;
        }
        return 0.0f;
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kz] */
    public final kz c() {
        kz kzVar = this.p;
        if (kzVar == null) {
            ?? obj = new Object();
            obj.x = this.f;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            do {
                int S = uz5.S(((Layout) obj.x).getText(), '\n', i, 4);
                if (S < 0) {
                    i = ((Layout) obj.x).getText().length();
                } else {
                    i = S + 1;
                }
                arrayList.add(Integer.valueOf(i));
            } while (i < ((Layout) obj.x).getText().length());
            obj.y = arrayList;
            int size = arrayList.size();
            ArrayList arrayList2 = new ArrayList(size);
            for (int i2 = 0; i2 < size; i2++) {
                arrayList2.add(null);
            }
            obj.z = arrayList2;
            obj.A = new boolean[((ArrayList) obj.y).size()];
            ((ArrayList) obj.y).size();
            this.p = obj;
            return obj;
        }
        return kzVar;
    }

    public final float d(int i) {
        int i2;
        Paint.FontMetricsInt fontMetricsInt;
        int i3 = this.g;
        int i4 = i3 - 1;
        Layout layout = this.f;
        if (i == i4 && (fontMetricsInt = this.l) != null) {
            return layout.getLineBottom(i - 1) + fontMetricsInt.bottom;
        }
        float lineBottom = this.h + layout.getLineBottom(i);
        if (i == i3 - 1) {
            i2 = this.i;
        } else {
            i2 = 0;
        }
        return lineBottom + i2;
    }

    public final int e(int i) {
        ThreadLocal threadLocal = ed6.a;
        Layout layout = this.f;
        if (layout.getEllipsisCount(i) > 0 && this.b == TextUtils.TruncateAt.END) {
            return layout.getText().length();
        }
        return layout.getLineEnd(i);
    }

    public final int f(int i) {
        int i2 = this.g;
        if (i2 <= 0) {
            return 0;
        }
        int lineForOffset = this.f.getLineForOffset(i);
        int i3 = i2 - 1;
        if (lineForOffset > i3) {
            return i3;
        }
        return lineForOffset;
    }

    public final float g(int i) {
        return d(i) - h(i);
    }

    public final float h(int i) {
        int i2;
        float lineTop = this.f.getLineTop(i);
        if (i == 0) {
            i2 = 0;
        } else {
            i2 = this.h;
        }
        return lineTop + i2;
    }

    public final float i(int i, boolean z) {
        return b(f(i)) + c().v(i, true, z);
    }

    public final float j(int i, boolean z) {
        return b(f(i)) + c().v(i, false, z);
    }

    public final wp k() {
        wp wpVar = this.e;
        if (wpVar != null) {
            return wpVar;
        }
        Layout layout = this.f;
        wp wpVar2 = new wp(layout.getText(), layout.getText().length(), this.a.getTextLocale());
        this.e = wpVar2;
        return wpVar2;
    }
}
