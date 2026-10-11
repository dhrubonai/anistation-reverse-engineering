package p5;

import android.content.Intent;
import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.b0;
import com.google.android.gms.common.internal.c0;
import com.google.android.gms.dynamite.descriptors.com.google.firebase.auth.ModuleDescriptor;
import com.google.android.gms.fido.common.Transport;
import com.google.android.gms.fido.u2f.api.common.RegisterRequestParams;
import com.google.android.gms.fido.u2f.api.common.SignRequestParams;
import com.google.android.gms.internal.p002firebaseauthapi.zzaja;
import com.google.android.material.datepicker.p;
import java.util.ArrayList;

/* loaded from: classes.dex */
public final class i implements Parcelable.Creator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f8598a;

    public /* synthetic */ i(int i10) {
        this.f8598a = i10;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i10 = 0;
        String str = null;
        b5.a aVar = null;
        b0 b0Var = null;
        String str2 = null;
        Intent intent = null;
        d dVar = null;
        String str3 = null;
        byte[] bArr = null;
        switch (this.f8598a) {
            case 0:
                int readInt = parcel.readInt();
                try {
                    Parcelable.Creator<c> creator = c.CREATOR;
                    a[] values = a.values();
                    int length = values.length;
                    while (i10 < length) {
                        a aVar2 = values[i10];
                        if (readInt == aVar2.f8580a) {
                            return aVar2;
                        }
                        i10++;
                    }
                    throw new b(readInt);
                } catch (b e10) {
                    throw new RuntimeException(e10);
                }
            case 1:
                int q02 = q6.g.q0(parcel);
                String str4 = null;
                while (parcel.dataPosition() < q02) {
                    int readInt2 = parcel.readInt();
                    char c6 = (char) readInt2;
                    if (c6 != 2) {
                        if (c6 != 3) {
                            if (c6 != 4) {
                                q6.g.l0(readInt2, parcel);
                            } else {
                                str4 = q6.g.p(readInt2, parcel);
                            }
                        } else {
                            str = q6.g.p(readInt2, parcel);
                        }
                    } else {
                        i10 = q6.g.Q(readInt2, parcel);
                    }
                }
                q6.g.w(q02, parcel);
                return new c(str, i10, str4);
            case 2:
                int q03 = q6.g.q0(parcel);
                String str5 = null;
                ArrayList arrayList = null;
                while (parcel.dataPosition() < q03) {
                    int readInt3 = parcel.readInt();
                    char c10 = (char) readInt3;
                    if (c10 != 1) {
                        if (c10 != 2) {
                            if (c10 != 3) {
                                if (c10 != 4) {
                                    q6.g.l0(readInt3, parcel);
                                } else {
                                    arrayList = q6.g.t(parcel, readInt3, Transport.CREATOR);
                                }
                            } else {
                                str5 = q6.g.p(readInt3, parcel);
                            }
                        } else {
                            bArr = q6.g.m(readInt3, parcel);
                        }
                    } else {
                        i10 = q6.g.Q(readInt3, parcel);
                    }
                }
                q6.g.w(q03, parcel);
                return new d(i10, bArr, str5, arrayList);
            case 3:
                try {
                    return f.d(parcel.readString());
                } catch (e e11) {
                    throw new RuntimeException(e11);
                }
            case 4:
                int q04 = q6.g.q0(parcel);
                String str6 = null;
                byte[] bArr2 = null;
                while (parcel.dataPosition() < q04) {
                    int readInt4 = parcel.readInt();
                    char c11 = (char) readInt4;
                    if (c11 != 1) {
                        if (c11 != 2) {
                            if (c11 != 3) {
                                if (c11 != 4) {
                                    q6.g.l0(readInt4, parcel);
                                } else {
                                    str6 = q6.g.p(readInt4, parcel);
                                }
                            } else {
                                bArr2 = q6.g.m(readInt4, parcel);
                            }
                        } else {
                            str3 = q6.g.p(readInt4, parcel);
                        }
                    } else {
                        i10 = q6.g.Q(readInt4, parcel);
                    }
                }
                q6.g.w(q04, parcel);
                return new g(i10, str3, str6, bArr2);
            case 5:
                int q05 = q6.g.q0(parcel);
                Integer num = null;
                Double d10 = null;
                Uri uri = null;
                ArrayList arrayList2 = null;
                ArrayList arrayList3 = null;
                c cVar = null;
                String str7 = null;
                while (parcel.dataPosition() < q05) {
                    int readInt5 = parcel.readInt();
                    switch ((char) readInt5) {
                        case 2:
                            num = q6.g.R(readInt5, parcel);
                            break;
                        case 3:
                            d10 = q6.g.P(readInt5, parcel);
                            break;
                        case 4:
                            uri = (Uri) q6.g.o(parcel, readInt5, Uri.CREATOR);
                            break;
                        case 5:
                            arrayList2 = q6.g.t(parcel, readInt5, g.CREATOR);
                            break;
                        case 6:
                            arrayList3 = q6.g.t(parcel, readInt5, h.CREATOR);
                            break;
                        case zzaja.zze.zzg /* 7 */:
                            cVar = (c) q6.g.o(parcel, readInt5, c.CREATOR);
                            break;
                        case '\b':
                            str7 = q6.g.p(readInt5, parcel);
                            break;
                        default:
                            q6.g.l0(readInt5, parcel);
                            break;
                    }
                }
                q6.g.w(q05, parcel);
                return new RegisterRequestParams(num, d10, uri, arrayList2, arrayList3, cVar, str7);
            case 6:
                int q06 = q6.g.q0(parcel);
                String str8 = null;
                String str9 = null;
                while (parcel.dataPosition() < q06) {
                    int readInt6 = parcel.readInt();
                    char c12 = (char) readInt6;
                    if (c12 != 2) {
                        if (c12 != 3) {
                            if (c12 != 4) {
                                q6.g.l0(readInt6, parcel);
                            } else {
                                str9 = q6.g.p(readInt6, parcel);
                            }
                        } else {
                            str8 = q6.g.p(readInt6, parcel);
                        }
                    } else {
                        dVar = (d) q6.g.o(parcel, readInt6, d.CREATOR);
                    }
                }
                q6.g.w(q06, parcel);
                return new h(dVar, str8, str9);
            case zzaja.zze.zzg /* 7 */:
                int q07 = q6.g.q0(parcel);
                Integer num2 = null;
                Double d11 = null;
                Uri uri2 = null;
                byte[] bArr3 = null;
                ArrayList arrayList4 = null;
                c cVar2 = null;
                String str10 = null;
                while (parcel.dataPosition() < q07) {
                    int readInt7 = parcel.readInt();
                    switch ((char) readInt7) {
                        case 2:
                            num2 = q6.g.R(readInt7, parcel);
                            break;
                        case 3:
                            d11 = q6.g.P(readInt7, parcel);
                            break;
                        case 4:
                            uri2 = (Uri) q6.g.o(parcel, readInt7, Uri.CREATOR);
                            break;
                        case 5:
                            bArr3 = q6.g.m(readInt7, parcel);
                            break;
                        case 6:
                            arrayList4 = q6.g.t(parcel, readInt7, h.CREATOR);
                            break;
                        case zzaja.zze.zzg /* 7 */:
                            cVar2 = (c) q6.g.o(parcel, readInt7, c.CREATOR);
                            break;
                        case '\b':
                            str10 = q6.g.p(readInt7, parcel);
                            break;
                        default:
                            q6.g.l0(readInt7, parcel);
                            break;
                    }
                }
                q6.g.w(q07, parcel);
                return new SignRequestParams(num2, d11, uri2, bArr3, arrayList4, cVar2, str10);
            case 8:
                int q08 = q6.g.q0(parcel);
                int i11 = 0;
                while (parcel.dataPosition() < q08) {
                    int readInt8 = parcel.readInt();
                    char c13 = (char) readInt8;
                    if (c13 != 1) {
                        if (c13 != 2) {
                            if (c13 != 3) {
                                q6.g.l0(readInt8, parcel);
                            } else {
                                intent = (Intent) q6.g.o(parcel, readInt8, Intent.CREATOR);
                            }
                        } else {
                            i11 = q6.g.Q(readInt8, parcel);
                        }
                    } else {
                        i10 = q6.g.Q(readInt8, parcel);
                    }
                }
                q6.g.w(q08, parcel);
                return new r5.b(i10, i11, intent);
            case 9:
                int q09 = q6.g.q0(parcel);
                ArrayList arrayList5 = null;
                while (parcel.dataPosition() < q09) {
                    int readInt9 = parcel.readInt();
                    char c14 = (char) readInt9;
                    if (c14 != 1) {
                        if (c14 != 2) {
                            q6.g.l0(readInt9, parcel);
                        } else {
                            str2 = q6.g.p(readInt9, parcel);
                        }
                    } else {
                        arrayList5 = q6.g.r(readInt9, parcel);
                    }
                }
                q6.g.w(q09, parcel);
                return new r5.f(str2, arrayList5);
            case 10:
                int q010 = q6.g.q0(parcel);
                while (parcel.dataPosition() < q010) {
                    int readInt10 = parcel.readInt();
                    char c15 = (char) readInt10;
                    if (c15 != 1) {
                        if (c15 != 2) {
                            q6.g.l0(readInt10, parcel);
                        } else {
                            b0Var = (b0) q6.g.o(parcel, readInt10, b0.CREATOR);
                        }
                    } else {
                        i10 = q6.g.Q(readInt10, parcel);
                    }
                }
                q6.g.w(q010, parcel);
                return new r5.g(i10, b0Var);
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                int q011 = q6.g.q0(parcel);
                c0 c0Var = null;
                while (parcel.dataPosition() < q011) {
                    int readInt11 = parcel.readInt();
                    char c16 = (char) readInt11;
                    if (c16 != 1) {
                        if (c16 != 2) {
                            if (c16 != 3) {
                                q6.g.l0(readInt11, parcel);
                            } else {
                                c0Var = (c0) q6.g.o(parcel, readInt11, c0.CREATOR);
                            }
                        } else {
                            aVar = (b5.a) q6.g.o(parcel, readInt11, b5.a.CREATOR);
                        }
                    } else {
                        i10 = q6.g.Q(readInt11, parcel);
                    }
                }
                q6.g.w(q011, parcel);
                return new r5.h(i10, aVar, c0Var);
            case 12:
                return new z5.b(parcel);
            case 13:
                return new com.google.android.material.datepicker.c((p) parcel.readParcelable(p.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), (com.google.android.material.datepicker.b) parcel.readParcelable(com.google.android.material.datepicker.b.class.getClassLoader()), (p) parcel.readParcelable(p.class.getClassLoader()), parcel.readInt());
            case 14:
                return new com.google.android.material.datepicker.d(parcel.readLong());
            case 15:
                return p.d(parcel.readInt(), parcel.readInt());
            case 16:
                return new com.google.android.material.timepicker.g(parcel);
            case 17:
                return new a8.b(parcel);
            case 18:
                return new a8.e(parcel);
            case 19:
                return new a8.g(parcel);
            default:
                return new a8.h(parcel);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i10) {
        switch (this.f8598a) {
            case 0:
                return new a[i10];
            case 1:
                return new c[i10];
            case 2:
                return new d[i10];
            case 3:
                return new f[i10];
            case 4:
                return new g[i10];
            case 5:
                return new RegisterRequestParams[i10];
            case 6:
                return new h[i10];
            case zzaja.zze.zzg /* 7 */:
                return new SignRequestParams[i10];
            case 8:
                return new r5.b[i10];
            case 9:
                return new r5.f[i10];
            case 10:
                return new r5.g[i10];
            case ModuleDescriptor.MODULE_VERSION /* 11 */:
                return new r5.h[i10];
            case 12:
                return new z5.b[i10];
            case 13:
                return new com.google.android.material.datepicker.c[i10];
            case 14:
                return new com.google.android.material.datepicker.d[i10];
            case 15:
                return new p[i10];
            case 16:
                return new com.google.android.material.timepicker.g[i10];
            case 17:
                return new a8.b[i10];
            case 18:
                return new a8.e[i10];
            case 19:
                return new a8.g[i10];
            default:
                return new a8.h[i10];
        }
    }
}
