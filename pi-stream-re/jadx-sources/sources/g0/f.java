package g0;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;

/* loaded from: classes.dex */
public final class f implements e, g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f4198a = 0;

    /* renamed from: b, reason: collision with root package name */
    public final ClipData f4199b;

    /* renamed from: c, reason: collision with root package name */
    public final int f4200c;

    /* renamed from: d, reason: collision with root package name */
    public int f4201d;

    /* renamed from: e, reason: collision with root package name */
    public Uri f4202e;

    /* renamed from: f, reason: collision with root package name */
    public Bundle f4203f;

    public f(f fVar) {
        ClipData clipData = fVar.f4199b;
        clipData.getClass();
        this.f4199b = clipData;
        int i10 = fVar.f4200c;
        if (i10 < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too low)", "source", 0, 5));
        }
        if (i10 <= 5) {
            this.f4200c = i10;
            int i11 = fVar.f4201d;
            if ((i11 & 1) == i11) {
                this.f4201d = i11;
                this.f4202e = fVar.f4202e;
                this.f4203f = fVar.f4203f;
                return;
            } else {
                throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i11) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
            }
        }
        throw new IllegalArgumentException(String.format(Locale.US, "%s is out of range of [%d, %d] (too high)", "source", 0, 5));
    }

    @Override // g0.e
    public final void a(Bundle bundle) {
        this.f4203f = bundle;
    }

    @Override // g0.e
    public final void b(Uri uri) {
        this.f4202e = uri;
    }

    @Override // g0.e
    public final h build() {
        return new h(new f(this));
    }

    @Override // g0.e
    public final void c(int i10) {
        this.f4201d = i10;
    }

    @Override // g0.g
    public final ClipData g() {
        return this.f4199b;
    }

    @Override // g0.g
    public final int r() {
        return this.f4201d;
    }

    @Override // g0.g
    public final ContentInfo t() {
        return null;
    }

    public final String toString() {
        String str;
        String valueOf;
        String str2;
        switch (this.f4198a) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.f4199b.getDescription());
                sb.append(", source=");
                int i10 = this.f4200c;
                if (i10 != 0) {
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                if (i10 != 4) {
                                    if (i10 != 5) {
                                        str = String.valueOf(i10);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i11 = this.f4201d;
                if ((i11 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i11);
                }
                sb.append(valueOf);
                String str3 = "";
                if (this.f4202e == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + this.f4202e.toString().length() + ")";
                }
                sb.append(str2);
                if (this.f4203f != null) {
                    str3 = ", hasExtras";
                }
                return a3.g.t(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    @Override // g0.g
    public final int w() {
        return this.f4200c;
    }

    public f(ClipData clipData, int i10) {
        this.f4199b = clipData;
        this.f4200c = i10;
    }
}
