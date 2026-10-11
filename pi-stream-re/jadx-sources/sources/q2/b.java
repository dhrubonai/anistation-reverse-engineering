package q2;

import android.app.PendingIntent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.fragment.app.w;
import androidx.versionedparcelable.ParcelImpl;
import com.google.android.gms.auth.api.credentials.Credential;
import com.google.android.gms.auth.api.credentials.IdToken;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import java.util.ArrayList;
import java.util.HashSet;
import m3.h1;
import m3.i1;
import m3.v;
import r6.o0;

/* loaded from: classes.dex */
public final class b implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9081a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        char c6 = 4;
        switch (this.f9081a) {
            case 0:
                return new c(parcel);
            case 1:
                return new d(parcel);
            case 2:
                return new e(parcel);
            case 3:
                return new f(parcel);
            case 4:
                return new g(parcel);
            case 5:
                return new l(parcel);
            case 6:
                return new m(parcel);
            case zzaja.zze.zzg /* 7 */:
                return new n(parcel);
            case 8:
                String readString = parcel.readString();
                readString.getClass();
                String readString2 = parcel.readString();
                String[] createStringArray = parcel.createStringArray();
                createStringArray.getClass();
                return new o(readString, readString2, o0.k(createStringArray));
            case 9:
                return new p(parcel);
            case 10:
                return new r2.a(parcel);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                ArrayList arrayList = new ArrayList();
                parcel.readList(arrayList, r2.b.class.getClassLoader());
                return new r2.c(arrayList);
            case 12:
                return new r2.b(parcel.readInt(), parcel.readLong(), parcel.readLong());
            case 13:
                return new r2.d(parcel);
            case 14:
                return new s2.a(parcel);
            case 15:
                return new s2.e(parcel);
            case 16:
                return new s2.f();
            case 17:
                return new s2.i(parcel);
            case 18:
                return new s2.j(parcel.readLong(), parcel.readLong());
            case 19:
                return new t2.a(parcel);
            case 20:
                return new v(parcel);
            case 21:
                return new h1(parcel);
            case 22:
                return new i1(parcel);
            case 23:
                return new ParcelImpl(parcel);
            case 24:
                int q02 = q6.g.q0(parcel);
                HashSet hashSet = new HashSet();
                int i10 = 0;
                int i11 = 0;
                ArrayList arrayList2 = null;
                u4.d dVar = null;
                while (parcel.dataPosition() < q02) {
                    int readInt = parcel.readInt();
                    char c10 = (char) readInt;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    q6.g.l0(readInt, parcel);
                                } else {
                                    dVar = (u4.d) q6.g.o(parcel, readInt, u4.d.CREATOR);
                                    hashSet.add(4);
                                }
                            } else {
                                i11 = q6.g.Q(readInt, parcel);
                                hashSet.add(3);
                            }
                        } else {
                            arrayList2 = q6.g.t(parcel, readInt, u4.e.CREATOR);
                            hashSet.add(2);
                        }
                    } else {
                        i10 = q6.g.Q(readInt, parcel);
                        hashSet.add(1);
                    }
                }
                if (parcel.dataPosition() == q02) {
                    return new u4.b(hashSet, i10, arrayList2, i11, dVar);
                }
                throw new w(a3.g.n("Overread allowed size end=", q02), parcel);
            case 25:
                int q03 = q6.g.q0(parcel);
                int i12 = 0;
                ArrayList arrayList3 = null;
                ArrayList arrayList4 = null;
                ArrayList arrayList5 = null;
                ArrayList arrayList6 = null;
                ArrayList arrayList7 = null;
                while (parcel.dataPosition() < q03) {
                    int readInt2 = parcel.readInt();
                    switch ((char) readInt2) {
                        case 1:
                            i12 = q6.g.Q(readInt2, parcel);
                            break;
                        case 2:
                            arrayList3 = q6.g.r(readInt2, parcel);
                            break;
                        case 3:
                            arrayList4 = q6.g.r(readInt2, parcel);
                            break;
                        case 4:
                            arrayList5 = q6.g.r(readInt2, parcel);
                            break;
                        case 5:
                            arrayList6 = q6.g.r(readInt2, parcel);
                            break;
                        case 6:
                            arrayList7 = q6.g.r(readInt2, parcel);
                            break;
                        default:
                            q6.g.l0(readInt2, parcel);
                            break;
                    }
                }
                q6.g.w(q03, parcel);
                return new u4.d(i12, arrayList3, arrayList4, arrayList5, arrayList6, arrayList7);
            case 26:
                int q04 = q6.g.q0(parcel);
                HashSet hashSet2 = new HashSet();
                u4.f fVar = null;
                String str = null;
                String str2 = null;
                String str3 = null;
                int i13 = 0;
                while (parcel.dataPosition() < q04) {
                    int readInt3 = parcel.readInt();
                    char c11 = (char) readInt3;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != c6) {
                                    if (c11 != 5) {
                                        q6.g.l0(readInt3, parcel);
                                    } else {
                                        String p3 = q6.g.p(readInt3, parcel);
                                        hashSet2.add(5);
                                        str3 = p3;
                                    }
                                } else {
                                    String p9 = q6.g.p(readInt3, parcel);
                                    hashSet2.add(4);
                                    str2 = p9;
                                }
                            } else {
                                String p10 = q6.g.p(readInt3, parcel);
                                hashSet2.add(3);
                                str = p10;
                            }
                        } else {
                            u4.f fVar2 = (u4.f) q6.g.o(parcel, readInt3, u4.f.CREATOR);
                            hashSet2.add(2);
                            fVar = fVar2;
                        }
                    } else {
                        i13 = q6.g.Q(readInt3, parcel);
                        hashSet2.add(1);
                    }
                    c6 = 4;
                }
                if (parcel.dataPosition() == q04) {
                    return new u4.e(hashSet2, i13, fVar, str, str2, str3);
                }
                throw new w(a3.g.n("Overread allowed size end=", q04), parcel);
            case 27:
                int q05 = q6.g.q0(parcel);
                HashSet hashSet3 = new HashSet();
                int i14 = 0;
                int i15 = 0;
                String str4 = null;
                byte[] bArr = null;
                PendingIntent pendingIntent = null;
                u4.a aVar = null;
                while (parcel.dataPosition() < q05) {
                    int readInt4 = parcel.readInt();
                    switch ((char) readInt4) {
                        case 1:
                            i14 = q6.g.Q(readInt4, parcel);
                            hashSet3.add(1);
                            break;
                        case 2:
                            str4 = q6.g.p(readInt4, parcel);
                            hashSet3.add(2);
                            break;
                        case 3:
                            i15 = q6.g.Q(readInt4, parcel);
                            hashSet3.add(3);
                            break;
                        case 4:
                            bArr = q6.g.m(readInt4, parcel);
                            hashSet3.add(4);
                            break;
                        case 5:
                            pendingIntent = (PendingIntent) q6.g.o(parcel, readInt4, PendingIntent.CREATOR);
                            hashSet3.add(5);
                            break;
                        case 6:
                            aVar = (u4.a) q6.g.o(parcel, readInt4, u4.a.CREATOR);
                            hashSet3.add(6);
                            break;
                        default:
                            q6.g.l0(readInt4, parcel);
                            break;
                    }
                }
                if (parcel.dataPosition() == q05) {
                    return new u4.f(hashSet3, i14, str4, i15, bArr, pendingIntent, aVar);
                }
                throw new w(a3.g.n("Overread allowed size end=", q05), parcel);
            case 28:
                int q06 = q6.g.q0(parcel);
                int i16 = 0;
                boolean z9 = false;
                boolean z10 = false;
                long j4 = 0;
                while (parcel.dataPosition() < q06) {
                    int readInt5 = parcel.readInt();
                    char c12 = (char) readInt5;
                    if (c12 != 1) {
                        if (c12 != 2) {
                            if (c12 != 3) {
                                if (c12 != 4) {
                                    q6.g.l0(readInt5, parcel);
                                } else {
                                    z10 = q6.g.N(readInt5, parcel);
                                }
                            } else {
                                j4 = q6.g.S(readInt5, parcel);
                            }
                        } else {
                            z9 = q6.g.N(readInt5, parcel);
                        }
                    } else {
                        i16 = q6.g.Q(readInt5, parcel);
                    }
                }
                q6.g.w(q06, parcel);
                return new u4.a(i16, z9, j4, z10);
            default:
                int q07 = q6.g.q0(parcel);
                String str5 = null;
                String str6 = null;
                Uri uri = null;
                ArrayList arrayList8 = null;
                String str7 = null;
                String str8 = null;
                String str9 = null;
                String str10 = null;
                while (parcel.dataPosition() < q07) {
                    int readInt6 = parcel.readInt();
                    switch ((char) readInt6) {
                        case 1:
                            str5 = q6.g.p(readInt6, parcel);
                            break;
                        case 2:
                            str6 = q6.g.p(readInt6, parcel);
                            break;
                        case 3:
                            uri = (Uri) q6.g.o(parcel, readInt6, Uri.CREATOR);
                            break;
                        case 4:
                            arrayList8 = q6.g.t(parcel, readInt6, IdToken.CREATOR);
                            break;
                        case 5:
                            str7 = q6.g.p(readInt6, parcel);
                            break;
                        case 6:
                            str8 = q6.g.p(readInt6, parcel);
                            break;
                        case zzaja.zze.zzg /* 7 */:
                        case '\b':
                        default:
                            q6.g.l0(readInt6, parcel);
                            break;
                        case '\t':
                            str9 = q6.g.p(readInt6, parcel);
                            break;
                        case '\n':
                            str10 = q6.g.p(readInt6, parcel);
                            break;
                    }
                }
                q6.g.w(q07, parcel);
                return new Credential(str5, str6, uri, arrayList8, str7, str8, str9, str10);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f9081a) {
            case 0:
                return new c[i10];
            case 1:
                return new d[i10];
            case 2:
                return new e[i10];
            case 3:
                return new f[i10];
            case 4:
                return new g[i10];
            case 5:
                return new l[i10];
            case 6:
                return new m[i10];
            case zzaja.zze.zzg /* 7 */:
                return new n[i10];
            case 8:
                return new o[i10];
            case 9:
                return new p[i10];
            case 10:
                return new r2.a[i10];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new r2.c[i10];
            case 12:
                return new r2.b[i10];
            case 13:
                return new r2.d[i10];
            case 14:
                return new s2.a[i10];
            case 15:
                return new s2.e[i10];
            case 16:
                return new s2.f[i10];
            case 17:
                return new s2.i[i10];
            case 18:
                return new s2.j[i10];
            case 19:
                return new t2.a[i10];
            case 20:
                return new v[i10];
            case 21:
                return new h1[i10];
            case 22:
                return new i1[i10];
            case 23:
                return new ParcelImpl[i10];
            case 24:
                return new u4.b[i10];
            case 25:
                return new u4.d[i10];
            case 26:
                return new u4.e[i10];
            case 27:
                return new u4.f[i10];
            case 28:
                return new u4.a[i10];
            default:
                return new Credential[i10];
        }
    }
}
