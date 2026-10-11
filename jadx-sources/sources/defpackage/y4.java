package defpackage;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class y4 extends x4 {
    public final /* synthetic */ byte a;

    public /* synthetic */ y4(byte b) {
        this.a = b;
    }

    @Override // defpackage.x4
    public final Intent a(Context context, Object obj) {
        switch (this.a) {
            case 0:
                String[] strArr = (String[]) obj;
                strArr.getClass();
                Intent type = new Intent("android.intent.action.OPEN_DOCUMENT").putExtra("android.intent.extra.MIME_TYPES", strArr).setType("*/*");
                type.getClass();
                return type;
            case 1:
                Uri uri = (Uri) obj;
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT_TREE");
                if (uri != null) {
                    intent.putExtra("android.provider.extra.INITIAL_URI", uri);
                }
                return intent;
            case 2:
                String str = (String) obj;
                str.getClass();
                Intent putExtra = new Intent("androidx.activity.result.contract.action.REQUEST_PERMISSIONS").putExtra("androidx.activity.result.contract.extra.PERMISSIONS", new String[]{str});
                putExtra.getClass();
                return putExtra;
            default:
                Intent intent2 = (Intent) obj;
                intent2.getClass();
                return intent2;
        }
    }

    @Override // defpackage.x4
    public w4 b(Context context, Object obj) {
        switch (this.a) {
            case 0:
                ((String[]) obj).getClass();
                return null;
            case 1:
                return null;
            case 2:
                String str = (String) obj;
                str.getClass();
                if (t80.A(context, str) != 0) {
                    return null;
                }
                return new w4(Boolean.TRUE);
            default:
                return super.b(context, obj);
        }
    }

    @Override // defpackage.x4
    public final Object c(int i, Intent intent) {
        switch (this.a) {
            case 0:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 1:
                if (i != -1) {
                    intent = null;
                }
                if (intent == null) {
                    return null;
                }
                return intent.getData();
            case 2:
                if (intent != null && i == -1) {
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    boolean z = false;
                    if (intArrayExtra != null) {
                        int length = intArrayExtra.length;
                        int i2 = 0;
                        while (true) {
                            if (i2 < length) {
                                if (intArrayExtra[i2] == 0) {
                                    z = true;
                                } else {
                                    i2++;
                                }
                            }
                        }
                    }
                    return Boolean.valueOf(z);
                }
                return Boolean.FALSE;
            default:
                return new u4(i, intent);
        }
    }
}
