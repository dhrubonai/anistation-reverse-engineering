package y8;

import java.text.DateFormat;
import java.util.Date;
import java.util.regex.Pattern;

/* loaded from: classes.dex */
public final class k {

    /* renamed from: j, reason: collision with root package name */
    public static final Pattern f11751j = Pattern.compile("(\\d{2,4})[^\\d]*");

    /* renamed from: k, reason: collision with root package name */
    public static final Pattern f11752k = Pattern.compile("(?i)(jan|feb|mar|apr|may|jun|jul|aug|sep|oct|nov|dec).*");

    /* renamed from: l, reason: collision with root package name */
    public static final Pattern f11753l = Pattern.compile("(\\d{1,2})[^\\d]*");

    /* renamed from: m, reason: collision with root package name */
    public static final Pattern f11754m = Pattern.compile("(\\d{1,2}):(\\d{1,2}):(\\d{1,2})[^\\d]*");

    /* renamed from: a, reason: collision with root package name */
    public final String f11755a;

    /* renamed from: b, reason: collision with root package name */
    public final String f11756b;

    /* renamed from: c, reason: collision with root package name */
    public final long f11757c;

    /* renamed from: d, reason: collision with root package name */
    public final String f11758d;

    /* renamed from: e, reason: collision with root package name */
    public final String f11759e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f11760f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f11761g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f11762h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f11763i;

    public k(String str, String str2, long j4, String str3, String str4, boolean z9, boolean z10, boolean z11, boolean z12) {
        this.f11755a = str;
        this.f11756b = str2;
        this.f11757c = j4;
        this.f11758d = str3;
        this.f11759e = str4;
        this.f11760f = z9;
        this.f11761g = z10;
        this.f11762h = z11;
        this.f11763i = z12;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof k) {
            k kVar = (k) obj;
            if (r6.h0.g(kVar.f11755a, this.f11755a) && r6.h0.g(kVar.f11756b, this.f11756b) && kVar.f11757c == this.f11757c && r6.h0.g(kVar.f11758d, this.f11758d) && r6.h0.g(kVar.f11759e, this.f11759e) && kVar.f11760f == this.f11760f && kVar.f11761g == this.f11761g && kVar.f11762h == this.f11762h && kVar.f11763i == this.f11763i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i10;
        int i11;
        int i12;
        int hashCode = (this.f11756b.hashCode() + ((this.f11755a.hashCode() + 527) * 31)) * 31;
        long j4 = this.f11757c;
        int hashCode2 = (this.f11759e.hashCode() + ((this.f11758d.hashCode() + ((hashCode + ((int) (j4 ^ (j4 >>> 32)))) * 31)) * 31)) * 31;
        int i13 = 1231;
        if (this.f11760f) {
            i10 = 1231;
        } else {
            i10 = 1237;
        }
        int i14 = (hashCode2 + i10) * 31;
        if (this.f11761g) {
            i11 = 1231;
        } else {
            i11 = 1237;
        }
        int i15 = (i14 + i11) * 31;
        if (this.f11762h) {
            i12 = 1231;
        } else {
            i12 = 1237;
        }
        int i16 = (i15 + i12) * 31;
        if (!this.f11763i) {
            i13 = 1237;
        }
        return i16 + i13;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.f11755a);
        sb.append('=');
        sb.append(this.f11756b);
        if (this.f11762h) {
            long j4 = this.f11757c;
            if (j4 == Long.MIN_VALUE) {
                sb.append("; max-age=0");
            } else {
                sb.append("; expires=");
                String format = ((DateFormat) d9.c.f3255a.get()).format(new Date(j4));
                r6.h0.s(format, "STANDARD_DATE_FORMAT.get().format(this)");
                sb.append(format);
            }
        }
        if (!this.f11763i) {
            sb.append("; domain=");
            sb.append(this.f11758d);
        }
        sb.append("; path=");
        sb.append(this.f11759e);
        if (this.f11760f) {
            sb.append("; secure");
        }
        if (this.f11761g) {
            sb.append("; httponly");
        }
        String sb2 = sb.toString();
        r6.h0.s(sb2, "toString()");
        return sb2;
    }
}
