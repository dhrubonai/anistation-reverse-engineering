package b4;

import android.net.Uri;
import android.text.TextUtils;
import java.io.File;
import java.net.URL;

/* loaded from: classes.dex */
public final class e0 implements x {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f1453a;

    /* renamed from: b, reason: collision with root package name */
    public final x f1454b;

    public /* synthetic */ e0(x xVar, int i10) {
        this.f1453a = i10;
        this.f1454b = xVar;
    }

    @Override // b4.x
    public final w a(Object obj, int i10, int i11, v3.l lVar) {
        Uri uri;
        int i12 = this.f1453a;
        x xVar = this.f1454b;
        switch (i12) {
            case 0:
                String str = (String) obj;
                if (TextUtils.isEmpty(str)) {
                    uri = null;
                } else if (str.charAt(0) == '/') {
                    uri = Uri.fromFile(new File(str));
                } else {
                    Uri parse = Uri.parse(str);
                    if (parse.getScheme() == null) {
                        uri = Uri.fromFile(new File(str));
                    } else {
                        uri = parse;
                    }
                }
                if (uri == null || !xVar.b(uri)) {
                    return null;
                }
                return xVar.a(uri, i10, i11, lVar);
            default:
                return xVar.a(new o((URL) obj), i10, i11, lVar);
        }
    }

    @Override // b4.x
    public final /* bridge */ /* synthetic */ boolean b(Object obj) {
        switch (this.f1453a) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
