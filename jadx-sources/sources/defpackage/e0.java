package defpackage;

import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.net.NetworkRequest;
import android.os.Build;
import android.util.Log;
import com.unity3d.ads.core.data.datasource.VolumeSettingsChange;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-17faeaa4e2ea105f16b10ec31fd03082f4cfa6637e1a42b62c06284cbae9c44f */
/* loaded from: classes.dex */
public final class e0 extends t36 implements ic2 {
    public Object A;
    public final /* synthetic */ Object B;
    public final /* synthetic */ byte x;
    public boolean y;
    public Object z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(boolean z, y44 y44Var, sb2 sb2Var, w44 w44Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 5;
        this.y = z;
        this.z = y44Var;
        this.A = sb2Var;
        this.B = w44Var;
    }

    /* JADX WARN: Type inference failed for: r13v1, types: [r05, java.lang.Object] */
    private final Object i(Object obj) {
        sb2 miVar;
        Object wx0Var;
        boolean canBeSatisfiedBy;
        w11 w11Var = w11.x;
        boolean z = this.y;
        vz0 vz0Var = null;
        if (z) {
            if (z) {
                m37.N(obj);
            } else {
                ze0.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
        } else {
            m37.N(obj);
            tu4 tu4Var = (tu4) this.z;
            NetworkRequest a = ((qx0) this.A).a();
            byte b = 12;
            byte b2 = 3;
            boolean z2 = false;
            if (a == null) {
                k94 k94Var = ((qx0) this.A).a;
                if (k94Var == k94.x) {
                    a = null;
                } else {
                    NetworkRequest.Builder removeCapability = new NetworkRequest.Builder().addCapability(12).addCapability(16).removeCapability(15).removeCapability(13);
                    if (Build.VERSION.SDK_INT >= 30 && k94Var == k94.C) {
                        a = removeCapability.addCapability(25).build();
                    } else {
                        int ordinal = k94Var.ordinal();
                        if (ordinal != 2) {
                            if (ordinal != 3) {
                                if (ordinal == 4) {
                                    removeCapability = removeCapability.addTransportType(0);
                                }
                            } else {
                                removeCapability = removeCapability.addCapability(18);
                            }
                        } else {
                            removeCapability = removeCapability.addCapability(11);
                        }
                        a = removeCapability.build();
                    }
                }
            }
            if (a == null) {
                su4 su4Var = (su4) tu4Var;
                su4Var.getClass();
                su4Var.f(null);
                return pn6.a;
            }
            r82 r82Var = new r82(tl7.z(tu4Var, null, null, new e52((g94) this.B, tu4Var, vz0Var, (byte) 10), 3), tu4Var, b);
            byte b3 = 7;
            if (Build.VERSION.SDK_INT >= 30) {
                mn5 mn5Var = mn5.a;
                ConnectivityManager connectivityManager = ((g94) this.B).a;
                mn5Var.getClass();
                synchronized (mn5.b) {
                    LinkedHashMap linkedHashMap = mn5.c;
                    if (linkedHashMap.isEmpty()) {
                        xk3.d().a(b77.a, "NetworkRequestConstraintController register shared callback");
                        try {
                            connectivityManager.registerDefaultNetworkCallback(mn5Var);
                        } catch (SecurityException e) {
                            xk3.d().c(b77.a, "NetworkRequestConstraintController couldn't register callback", e);
                            r82Var.invoke(new wx0(7));
                            miVar = new jk5(b2);
                        }
                    } else if (mn5.e && mn5.f != null) {
                        xk3.d().a(b77.a, "NetworkRequestConstraintController send initial capabilities");
                        NetworkCapabilities networkCapabilities = mn5.d;
                        Boolean bool = mn5.f;
                        bool.getClass();
                        if (!bool.booleanValue()) {
                            canBeSatisfiedBy = a.canBeSatisfiedBy(networkCapabilities);
                            if (canBeSatisfiedBy) {
                                z2 = true;
                            }
                        }
                        if (z2) {
                            wx0Var = vx0.a;
                        } else {
                            wx0Var = new wx0(7);
                        }
                        r82Var.invoke(wx0Var);
                    }
                }
                miVar = new lb5(r82Var, connectivityManager, b3);
            } else {
                int i = lk1.c;
                ConnectivityManager connectivityManager2 = ((g94) this.B).a;
                lk1 lk1Var = new lk1(r82Var);
                ?? obj2 = new Object();
                try {
                    xk3.d().a(b77.a, "NetworkRequestConstraintController register callback");
                    connectivityManager2.registerNetworkCallback(a, lk1Var);
                    obj2.x = true;
                } catch (SecurityException e2) {
                    xk3.d().c(b77.a, "NetworkRequestConstraintController couldn't register callback", e2);
                    r82Var.invoke(new wx0(7));
                } catch (RuntimeException e3) {
                    if (b06.A(e3.getClass().getName(), "TooManyRequestsException", false)) {
                        xk3 d = xk3.d();
                        String str = b77.a;
                        if (d.a <= 3) {
                            Log.d(str, "NetworkRequestConstraintController couldn't register callback", e3);
                        }
                        r82Var.invoke(new wx0(7));
                    } else {
                        throw e3;
                    }
                }
                miVar = new mi((Object) obj2, (Object) connectivityManager2, (Object) lk1Var, (byte) 8);
            }
            kz3 kz3Var = new kz3(miVar, (byte) 2);
            this.y = true;
            if (n77.s(tu4Var, kz3Var, this) == w11Var) {
                return w11Var;
            }
        }
        return pn6.a;
    }

    @Override // defpackage.h30
    public final vz0 create(Object obj, vz0 vz0Var) {
        byte b = this.x;
        Object obj2 = this.B;
        switch (b) {
            case 0:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 0);
            case 1:
                e0 e0Var = new e0((jc2) this.A, (d9) obj2, vz0Var, (byte) 1);
                e0Var.z = obj;
                return e0Var;
            case 2:
                e0 e0Var2 = new e0((jc2) this.A, (e9) obj2, vz0Var, (byte) 2);
                e0Var2.z = obj;
                return e0Var2;
            case 3:
                e0 e0Var3 = new e0((kc2) this.A, (d9) obj2, vz0Var, (byte) 3);
                e0Var3.z = obj;
                return e0Var3;
            case 4:
                e0 e0Var4 = new e0((kc2) this.A, (e9) obj2, vz0Var, (byte) 4);
                e0Var4.z = obj;
                return e0Var4;
            case 5:
                return new e0(this.y, (y44) this.z, (sb2) this.A, (w44) obj2, vz0Var);
            case 6:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 6);
            case 7:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 7);
            case 8:
                e0 e0Var5 = new e0((xi6) this.A, (w44) obj2, vz0Var, (byte) 8);
                e0Var5.z = obj;
                return e0Var5;
            case 9:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 9);
            case 10:
                e0 e0Var6 = new e0((x42) this.A, (oj0) obj2, vz0Var, (byte) 10);
                e0Var6.z = obj;
                return e0Var6;
            case 11:
                e0 e0Var7 = new e0((ki5) this.A, (VolumeSettingsChange) obj2, vz0Var, (byte) 11);
                e0Var7.z = obj;
                return e0Var7;
            case 12:
                e0 e0Var8 = new e0((p51) this.A, (ic2) obj2, vz0Var, (byte) 12);
                e0Var8.z = obj;
                return e0Var8;
            case 13:
                e0 e0Var9 = new e0((ma1) this.A, (ic2) obj2, vz0Var, (byte) 13);
                e0Var9.z = obj;
                return e0Var9;
            case 14:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 14);
            case 15:
                e0 e0Var10 = new e0(this.A, (f91) obj2, vz0Var, (byte) 15);
                e0Var10.z = obj;
                return e0Var10;
            case 16:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 16);
            case 17:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 17);
            case 18:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 18);
            case 19:
                e0 e0Var11 = new e0((f52) this.A, (x42) obj2, vz0Var, (byte) 19);
                e0Var11.z = obj;
                return e0Var11;
            case 20:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 20);
            case 21:
                return new e0((za0) obj2, vz0Var);
            case 22:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 22);
            case 23:
                e0 e0Var12 = new e0((ic2) this.A, (wf0) obj2, vz0Var, (byte) 23);
                e0Var12.z = obj;
                return e0Var12;
            case 24:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 24);
            case 25:
                return new e0((String[]) this.A, (l24) obj2, vz0Var, (byte) 25);
            case 26:
                return new e0(this.z, this.A, obj2, vz0Var, (byte) 26);
            case 27:
                e0 e0Var13 = new e0((qx0) this.A, (g94) obj2, vz0Var, (byte) 27);
                e0Var13.z = obj;
                return e0Var13;
            case 28:
                return new e0((w05) this.A, (jr4) obj2, vz0Var, (byte) 28);
            default:
                e0 e0Var14 = new e0((kz4) this.A, (ev2) obj2, vz0Var, (byte) 29);
                e0Var14.z = obj;
                return e0Var14;
        }
    }

    @Override // defpackage.ic2
    public final Object invoke(Object obj, Object obj2) {
        byte b = this.x;
        pn6 pn6Var = pn6.a;
        switch (b) {
            case 0:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 1:
                return ((e0) create((cn3) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 2:
                return ((e0) create((y71) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 3:
                return ((e0) create((ai4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 4:
                return ((e0) create((ai4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 5:
                ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
                return pn6Var;
            case 6:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 7:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 8:
                return ((e0) create((ru4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 9:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 10:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 11:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 12:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 13:
                return ((e0) create((wc5) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 14:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 15:
                return ((e0) create((l97) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 16:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 17:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 18:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 19:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 20:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 21:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 22:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 23:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 24:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 25:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 26:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 27:
                return ((e0) create((tu4) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            case 28:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
            default:
                return ((e0) create((v11) obj, (vz0) obj2)).invokeSuspend(pn6Var);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:420:0x072e, code lost:
    
        if (r0 == r8) goto L382;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:178:0x030f A[Catch: all -> 0x02e3, TryCatch #4 {all -> 0x02e3, blocks: (B:174:0x02dd, B:176:0x0307, B:178:0x030f, B:179:0x031c, B:186:0x032c, B:188:0x02f9, B:192:0x032f, B:196:0x0334, B:197:0x0335, B:204:0x02f4, B:181:0x031d, B:183:0x0323), top: B:170:0x02d1, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:190:0x0305  */
    /* JADX WARN: Removed duplicated region for block: B:199:0x0336  */
    /* JADX WARN: Type inference failed for: r3v62, types: [vz4] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:159:0x0303 -> B:146:0x0307). Please report as a decompilation issue!!! */
    @Override // defpackage.h30
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r17) {
        /*
            Method dump skipped, instructions count: 2456
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.e0.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Object obj2, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.A = obj;
        this.B = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e0(Object obj, Object obj2, Object obj3, vz0 vz0Var, byte b) {
        super(2, vz0Var);
        this.x = b;
        this.z = obj;
        this.A = obj2;
        this.B = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e0(za0 za0Var, vz0 vz0Var) {
        super(2, vz0Var);
        this.x = (byte) 21;
        this.B = za0Var;
    }
}
