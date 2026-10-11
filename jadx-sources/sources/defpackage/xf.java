package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import java.io.File;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class xf {
    public final /* synthetic */ byte a;

    public /* synthetic */ xf(byte b) {
        this.a = b;
    }

    public final lp6 a(Object obj, mg4 mg4Var) {
        switch (this.a) {
            case 0:
                return ct5.o(((Uri) obj).toString());
            case 1:
                return ct5.a(((File) obj).getPath());
            case 2:
                return ct5.a(((qj4) obj).x.q());
            case 3:
                int intValue = ((Number) obj).intValue();
                Context context = mg4Var.a;
                try {
                    if (context.getResources().getResourceEntryName(intValue) != null) {
                        return ct5.o("android.resource://" + context.getPackageName() + "/" + intValue);
                    }
                } catch (Resources.NotFoundException unused) {
                }
                return null;
            default:
                return ct5.o((String) obj);
        }
    }
}
