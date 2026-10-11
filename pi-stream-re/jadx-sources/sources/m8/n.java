package m8;

import android.app.Activity;
import android.content.DialogInterface;
import android.content.Intent;
import android.provider.DocumentsContract;

/* loaded from: classes.dex */
public final /* synthetic */ class n implements DialogInterface.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f7661a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f7662b;

    public /* synthetic */ n(Object obj, int i10) {
        this.f7661a = i10;
        this.f7662b = obj;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i10) {
        int i11 = this.f7661a;
        Object obj = this.f7662b;
        switch (i11) {
            case 0:
                ((int[]) obj)[0] = i10;
                return;
            case 1:
                ((int[]) obj)[0] = i10;
                return;
            default:
                z3.e eVar = (z3.e) obj;
                eVar.getClass();
                Intent intent = new Intent("android.intent.action.OPEN_DOCUMENT");
                intent.addCategory("android.intent.category.OPENABLE");
                intent.setType("font/ttf");
                intent.putExtra("android.provider.extra.INITIAL_URI", DocumentsContract.buildDocumentUri("com.android.externalstorage.documents", "primary"));
                ((Activity) eVar.f12044b).startActivityForResult(intent, 7106);
                return;
        }
    }
}
