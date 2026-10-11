package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class lo7 extends AsyncTask {
    public static final zk3 c = new zk3("FetchBitmapTask", null);
    public final ar7 a;
    public final kz b;

    public lo7(Context context, int i, int i2, kz kzVar) {
        ar7 ar7Var;
        this.b = kzVar;
        Context applicationContext = context.getApplicationContext();
        jm7 jm7Var = new jm7(this);
        zk3 zk3Var = il7.a;
        try {
            yl7 b = il7.b(applicationContext.getApplicationContext());
            ic4 ic4Var = new ic4(applicationContext.getApplicationContext());
            Parcel L = b.L(b.K(), 8);
            int readInt = L.readInt();
            L.recycle();
            if (readInt >= 233700000) {
                ar7Var = b.T(ic4Var, new ic4(this), jm7Var, i, i2);
            } else {
                ar7Var = b.S(new ic4(this), jm7Var, i, i2);
            }
        } catch (RemoteException | h04 e) {
            il7.a.a(e, "Unable to call %s on %s.", "newFetchBitmapTaskImpl", yl7.class.getSimpleName());
            ar7Var = null;
        }
        this.a = ar7Var;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        ar7 ar7Var;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (ar7Var = this.a) != null) {
            try {
                fp7 fp7Var = (fp7) ar7Var;
                Parcel K = fp7Var.K();
                nn7.b(K, uri);
                Parcel L = fp7Var.L(K, 1);
                Bitmap bitmap = (Bitmap) nn7.a(L, Bitmap.CREATOR);
                L.recycle();
                return bitmap;
            } catch (RemoteException e) {
                c.a(e, "Unable to call %s on %s.", "doFetch", ar7.class.getSimpleName());
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        kz kzVar = this.b;
        if (kzVar != null) {
            ec7 ec7Var = (ec7) kzVar.B;
            if (ec7Var != null) {
                ec7Var.a(bitmap);
            }
            kzVar.A = null;
        }
    }
}
