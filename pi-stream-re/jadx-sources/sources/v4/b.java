package v4;

import android.os.Parcelable;
import com.google.android.gms.auth.api.credentials.CredentialPickerConfig;
import com.google.android.gms.auth.api.credentials.HintRequest;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.auth.api.identity.AuthorizationRequest;
import com.google.android.gms.auth.api.identity.SaveAccountLinkingTokenRequest;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.auth.api.signin.internal.SignInConfiguration;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import w4.c;
import w4.d;
import w4.e;
import w4.f;
import w4.g;
import w4.h;
import w4.i;
import w4.j;
import w4.k;
import w4.l;
import w4.m;
import w4.n;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f10662a;

    public /* synthetic */ b(int i10) {
        this.f10662a = i10;
    }

    /*  JADX ERROR: JadxRuntimeException in pass: BlockProcessor
        jadx.core.utils.exceptions.JadxRuntimeException: CFG modification limit reached, blocks count: 702
        	at jadx.core.dex.visitors.blocks.BlockProcessor.processBlocksTree(BlockProcessor.java:64)
        	at jadx.core.dex.visitors.blocks.BlockProcessor.visit(BlockProcessor.java:44)
        */
    @Override // android.os.Parcelable.Creator
    public final java.lang.Object createFromParcel(android.os.Parcel r28) {
        /*
            Method dump skipped, instructions count: 2334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: v4.b.createFromParcel(android.os.Parcel):java.lang.Object");
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ Object[] newArray(int i10) {
        switch (this.f10662a) {
            case 0:
                return new CredentialPickerConfig[i10];
            case 1:
                return new a[i10];
            case 2:
                return new HintRequest[i10];
            case 3:
                return new IdToken[i10];
            case 4:
                return new AuthorizationRequest[i10];
            case 5:
                return new w4.a[i10];
            case 6:
                return new f[i10];
            case zzaja.zze.zzg /* 7 */:
                return new g[i10];
            case 8:
                return new h[i10];
            case 9:
                return new i[i10];
            case 10:
                return new w4.b[i10];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new c[i10];
            case 12:
                return new d[i10];
            case 13:
                return new e[i10];
            case 14:
                return new SaveAccountLinkingTokenRequest[i10];
            case 15:
                return new j[i10];
            case 16:
                return new k[i10];
            case 17:
                return new l[i10];
            case 18:
                return new m[i10];
            case 19:
                return new n[i10];
            case 20:
                return new y4.a[i10];
            case 21:
                return new y4.b[i10];
            case 22:
                return new a5.a[i10];
            case 23:
                return new SignInConfiguration[i10];
            case 24:
                return new GoogleSignInAccount[i10];
            case 25:
                return new GoogleSignInOptions[i10];
            case 26:
                return new SignInAccount[i10];
            case 27:
                return new r4.a[i10];
            case 28:
                return new r4.b[i10];
            default:
                return new r4.c[i10];
        }
    }
}
