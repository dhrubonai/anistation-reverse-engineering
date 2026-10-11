package defpackage;

import android.accounts.Account;
import android.content.Context;
import android.os.Handler;
import android.os.Parcel;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class ib7 extends ua7 implements sh2, th2 {
    public static final qa7 m = kb7.a;
    public final Context f;
    public final Handler g;
    public final qa7 h;
    public final Set i;
    public final tp j;
    public mo5 k;
    public kh0 l;

    public ib7(Context context, h15 h15Var, tp tpVar) {
        attachInterface(this, "com.google.android.gms.signin.internal.ISignInCallbacks");
        this.f = context;
        this.g = h15Var;
        this.j = tpVar;
        this.i = (Set) tpVar.y;
        this.h = m;
    }

    @Override // defpackage.th2
    public final void a(hw0 hw0Var) {
        this.l.b(hw0Var);
    }

    @Override // defpackage.sh2
    public final void b(int i) {
        kh0 kh0Var = this.l;
        wa7 wa7Var = (wa7) ((uh2) kh0Var.C).G.get((kp) kh0Var.z);
        if (wa7Var != null) {
            if (wa7Var.m) {
                wa7Var.m(new hw0(17, null, null));
            } else {
                wa7Var.b(i);
            }
        }
    }

    @Override // defpackage.sh2
    public final void onConnected() {
        GoogleSignInAccount googleSignInAccount;
        Parcel obtain;
        Parcel obtain2;
        mo5 mo5Var = this.k;
        mo5Var.getClass();
        byte b = 12;
        boolean z = false;
        try {
            mo5Var.C.getClass();
            Account account = new Account("<<default account>>", "com.google");
            try {
                if ("<<default account>>".equals(account.name)) {
                    Context context = mo5Var.c;
                    ReentrantLock reentrantLock = ry5.c;
                    a34.x(context);
                    ReentrantLock reentrantLock2 = ry5.c;
                    reentrantLock2.lock();
                    try {
                        ry5 ry5Var = ry5.d;
                        if (ry5Var == null) {
                            ry5Var = new ry5(context.getApplicationContext());
                            ry5.d = ry5Var;
                        }
                        reentrantLock2.unlock();
                        String a = ry5Var.a("defaultGoogleSignInAccount");
                        if (!TextUtils.isEmpty(a)) {
                            StringBuilder sb = new StringBuilder(20 + String.valueOf(a).length());
                            sb.append("googleSignInAccount:");
                            sb.append(a);
                            String a2 = ry5Var.a(sb.toString());
                            if (a2 != null) {
                                try {
                                    googleSignInAccount = GoogleSignInAccount.c(a2);
                                } catch (JSONException unused) {
                                }
                                Integer num = mo5Var.E;
                                a34.x(num);
                                yb7 yb7Var = new yb7(2, account, num.intValue(), googleSignInAccount);
                                mb7 mb7Var = (mb7) mo5Var.m();
                                obtain = Parcel.obtain();
                                obtain.writeInterfaceToken(mb7Var.g);
                                int i = db7.a;
                                obtain.writeInt(1);
                                int s0 = z51.s0(obtain, 20293);
                                z51.r0(obtain, 1, 4);
                                obtain.writeInt(1);
                                z51.l0(obtain, 2, yb7Var, 0);
                                z51.t0(obtain, s0);
                                obtain.writeStrongBinder(this);
                                obtain2 = Parcel.obtain();
                                mb7Var.f.transact(12, obtain, obtain2, 0);
                                obtain2.readException();
                                obtain.recycle();
                                obtain2.recycle();
                                return;
                            }
                        }
                    } catch (Throwable th) {
                        reentrantLock2.unlock();
                        throw th;
                    }
                }
                mb7Var.f.transact(12, obtain, obtain2, 0);
                obtain2.readException();
                obtain.recycle();
                obtain2.recycle();
                return;
            } catch (Throwable th2) {
                obtain.recycle();
                obtain2.recycle();
                throw th2;
            }
            googleSignInAccount = null;
            Integer num2 = mo5Var.E;
            a34.x(num2);
            yb7 yb7Var2 = new yb7(2, account, num2.intValue(), googleSignInAccount);
            mb7 mb7Var2 = (mb7) mo5Var.m();
            obtain = Parcel.obtain();
            obtain.writeInterfaceToken(mb7Var2.g);
            int i2 = db7.a;
            obtain.writeInt(1);
            int s02 = z51.s0(obtain, 20293);
            z51.r0(obtain, 1, 4);
            obtain.writeInt(1);
            z51.l0(obtain, 2, yb7Var2, 0);
            z51.t0(obtain, s02);
            obtain.writeStrongBinder(this);
            obtain2 = Parcel.obtain();
        } catch (RemoteException e) {
            Log.w("SignInClientImpl", "Remote service probably died when signIn is called");
            try {
                this.g.post(new yc2(b, this, new sb7(1, new hw0(8, null, null), null), z));
            } catch (RemoteException unused2) {
                Log.wtf("SignInClientImpl", "ISignInCallbacks#onSignInComplete should be executed from the same process, unexpected RemoteException.", e);
            }
        }
    }
}
