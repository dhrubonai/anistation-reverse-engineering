package z2;

import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.text.style.StyleSpan;
import android.text.style.UnderlineSpan;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f11966a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f11967b;

    /* renamed from: c, reason: collision with root package name */
    public final StringBuilder f11968c;

    /* renamed from: d, reason: collision with root package name */
    public int f11969d;

    /* renamed from: e, reason: collision with root package name */
    public int f11970e;

    /* renamed from: f, reason: collision with root package name */
    public int f11971f;

    /* renamed from: g, reason: collision with root package name */
    public int f11972g;

    /* renamed from: h, reason: collision with root package name */
    public int f11973h;

    public b(int i10, int i11) {
        ArrayList arrayList = new ArrayList();
        this.f11966a = arrayList;
        ArrayList arrayList2 = new ArrayList();
        this.f11967b = arrayList2;
        StringBuilder sb = new StringBuilder();
        this.f11968c = sb;
        this.f11972g = i10;
        arrayList.clear();
        arrayList2.clear();
        sb.setLength(0);
        this.f11969d = 15;
        this.f11970e = 0;
        this.f11971f = 0;
        this.f11973h = i11;
    }

    public final void a(char c6) {
        StringBuilder sb = this.f11968c;
        if (sb.length() < 32) {
            sb.append(c6);
        }
    }

    public final void b() {
        a aVar;
        int i10;
        StringBuilder sb = this.f11968c;
        int length = sb.length();
        if (length > 0) {
            sb.delete(length - 1, length);
            ArrayList arrayList = this.f11966a;
            int size = arrayList.size();
            while (true) {
                size--;
                if (size >= 0 && (i10 = (aVar = (a) arrayList.get(size)).f11965c) == length) {
                    aVar.f11965c = i10 - 1;
                } else {
                    return;
                }
            }
        }
    }

    public final e1.b c(int i10) {
        int i11;
        float f10;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        int i12 = 0;
        while (true) {
            ArrayList arrayList = this.f11967b;
            if (i12 >= arrayList.size()) {
                break;
            }
            spannableStringBuilder.append((CharSequence) arrayList.get(i12));
            spannableStringBuilder.append('\n');
            i12++;
        }
        spannableStringBuilder.append((CharSequence) d());
        if (spannableStringBuilder.length() == 0) {
            return null;
        }
        int i13 = this.f11970e + this.f11971f;
        int length = (32 - i13) - spannableStringBuilder.length();
        int i14 = i13 - length;
        if (i10 != Integer.MIN_VALUE) {
            i11 = i10;
        } else if (this.f11972g == 2 && (Math.abs(i14) < 3 || length < 0)) {
            i11 = 1;
        } else if (this.f11972g == 2 && i14 > 0) {
            i11 = 2;
        } else {
            i11 = 0;
        }
        if (i11 != 1) {
            if (i11 == 2) {
                i13 = 32 - length;
            }
            f10 = ((i13 / 32.0f) * 0.8f) + 0.1f;
        } else {
            f10 = 0.5f;
        }
        float f11 = f10;
        int i15 = this.f11969d;
        if (i15 > 7) {
            i15 = (i15 - 15) - 2;
        } else if (this.f11972g == 1) {
            i15 -= this.f11973h - 1;
        }
        return new e1.b(spannableStringBuilder, Layout.Alignment.ALIGN_NORMAL, null, null, i15, 1, Integer.MIN_VALUE, f11, i11, Integer.MIN_VALUE, -3.4028235E38f, -3.4028235E38f, -3.4028235E38f, false, -16777216, Integer.MIN_VALUE, 0.0f);
    }

    public final SpannableString d() {
        int i10;
        boolean z9;
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(this.f11968c);
        int length = spannableStringBuilder.length();
        int i11 = -1;
        int i12 = -1;
        int i13 = -1;
        int i14 = -1;
        int i15 = 0;
        int i16 = 0;
        boolean z10 = false;
        while (true) {
            ArrayList arrayList = this.f11966a;
            if (i15 >= arrayList.size()) {
                break;
            }
            a aVar = (a) arrayList.get(i15);
            boolean z11 = aVar.f11964b;
            int i17 = aVar.f11963a;
            if (i17 != 8) {
                if (i17 == 7) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                if (i17 != 7) {
                    i14 = c.A[i17];
                }
                z10 = z9;
            }
            int i18 = aVar.f11965c;
            i15++;
            if (i15 < arrayList.size()) {
                i10 = ((a) arrayList.get(i15)).f11965c;
            } else {
                i10 = length;
            }
            if (i18 != i10) {
                if (i11 != -1 && !z11) {
                    spannableStringBuilder.setSpan(new UnderlineSpan(), i11, i18, 33);
                    i11 = -1;
                } else if (i11 == -1 && z11) {
                    i11 = i18;
                }
                if (i12 != -1 && !z10) {
                    spannableStringBuilder.setSpan(new StyleSpan(2), i12, i18, 33);
                    i12 = -1;
                } else if (i12 == -1 && z10) {
                    i12 = i18;
                }
                if (i14 != i13) {
                    if (i13 != -1) {
                        spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, i18, 33);
                    }
                    i13 = i14;
                    i16 = i18;
                }
            }
        }
        if (i11 != -1 && i11 != length) {
            spannableStringBuilder.setSpan(new UnderlineSpan(), i11, length, 33);
        }
        if (i12 != -1 && i12 != length) {
            spannableStringBuilder.setSpan(new StyleSpan(2), i12, length, 33);
        }
        if (i16 != length && i13 != -1) {
            spannableStringBuilder.setSpan(new ForegroundColorSpan(i13), i16, length, 33);
        }
        return new SpannableString(spannableStringBuilder);
    }

    public final boolean e() {
        if (this.f11966a.isEmpty() && this.f11967b.isEmpty() && this.f11968c.length() == 0) {
            return true;
        }
        return false;
    }
}
