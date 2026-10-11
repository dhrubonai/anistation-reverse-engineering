.class public final Lcom/google/android/gms/common/internal/j;
.super Lc5/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/j;",
            ">;"
        }
    .end annotation
.end field

.field public static final F:[Lcom/google/android/gms/common/api/Scope;

.field public static final G:[Lb5/c;


# instance fields
.field public A:[Lb5/c;

.field public final B:Z

.field public final C:I

.field public D:Z

.field public final E:Ljava/lang/String;

.field public final a:I

.field public final b:I

.field public final c:I

.field public d:Ljava/lang/String;

.field public e:Landroid/os/IBinder;

.field public f:[Lcom/google/android/gms/common/api/Scope;

.field public x:Landroid/os/Bundle;

.field public y:Landroid/accounts/Account;

.field public z:[Lb5/c;


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/y;

    const/16 v1, 0x9

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/y;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/internal/j;->CREATOR:Landroid/os/Parcelable$Creator;

    const/4 v0, 0x0

    new-array v1, v0, [Lcom/google/android/gms/common/api/Scope;

    sput-object v1, Lcom/google/android/gms/common/internal/j;->F:[Lcom/google/android/gms/common/api/Scope;

    new-array v0, v0, [Lb5/c;

    sput-object v0, Lcom/google/android/gms/common/internal/j;->G:[Lb5/c;

    return-void
.end method

.method public constructor <init>(IIILjava/lang/String;Landroid/os/IBinder;[Lcom/google/android/gms/common/api/Scope;Landroid/os/Bundle;Landroid/accounts/Account;[Lb5/c;[Lb5/c;ZIZLjava/lang/String;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    if-nez p6, :cond_0

    .line 5
    .line 6
    sget-object p6, Lcom/google/android/gms/common/internal/j;->F:[Lcom/google/android/gms/common/api/Scope;

    .line 7
    .line 8
    :cond_0
    if-nez p7, :cond_1

    .line 9
    .line 10
    new-instance p7, Landroid/os/Bundle;

    .line 11
    .line 12
    invoke-direct {p7}, Landroid/os/Bundle;-><init>()V

    .line 13
    .line 14
    .line 15
    :cond_1
    sget-object v0, Lcom/google/android/gms/common/internal/j;->G:[Lb5/c;

    .line 16
    .line 17
    if-nez p9, :cond_2

    .line 18
    .line 19
    move-object p9, v0

    .line 20
    :cond_2
    if-nez p10, :cond_3

    .line 21
    .line 22
    move-object p10, v0

    .line 23
    :cond_3
    iput p1, p0, Lcom/google/android/gms/common/internal/j;->a:I

    .line 24
    .line 25
    iput p2, p0, Lcom/google/android/gms/common/internal/j;->b:I

    .line 26
    .line 27
    iput p3, p0, Lcom/google/android/gms/common/internal/j;->c:I

    .line 28
    .line 29
    const-string p2, "com.google.android.gms"

    .line 30
    .line 31
    invoke-virtual {p2, p4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 32
    .line 33
    .line 34
    move-result p3

    .line 35
    if-eqz p3, :cond_4

    .line 36
    .line 37
    iput-object p2, p0, Lcom/google/android/gms/common/internal/j;->d:Ljava/lang/String;

    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_4
    iput-object p4, p0, Lcom/google/android/gms/common/internal/j;->d:Ljava/lang/String;

    .line 41
    .line 42
    :goto_0
    const/4 p2, 0x2

    .line 43
    if-ge p1, p2, :cond_7

    .line 44
    .line 45
    if-eqz p5, :cond_6

    .line 46
    .line 47
    sget p1, Lcom/google/android/gms/common/internal/a;->a:I

    .line 48
    .line 49
    const-string p1, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 50
    .line 51
    invoke-interface {p5, p1}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 52
    .line 53
    .line 54
    move-result-object p1

    .line 55
    instance-of p3, p1, Lcom/google/android/gms/common/internal/m;

    .line 56
    .line 57
    if-eqz p3, :cond_5

    .line 58
    .line 59
    check-cast p1, Lcom/google/android/gms/common/internal/m;

    .line 60
    .line 61
    goto :goto_1

    .line 62
    :cond_5
    new-instance p1, Lcom/google/android/gms/common/internal/s0;

    .line 63
    .line 64
    invoke-direct {p1, p5}, Lcom/google/android/gms/common/internal/s0;-><init>(Landroid/os/IBinder;)V

    .line 65
    .line 66
    .line 67
    :goto_1
    if-eqz p1, :cond_6

    .line 68
    .line 69
    invoke-static {}, Landroid/os/Binder;->clearCallingIdentity()J

    .line 70
    .line 71
    .line 72
    move-result-wide p3

    .line 73
    :try_start_0
    check-cast p1, Lcom/google/android/gms/common/internal/s0;

    .line 74
    .line 75
    invoke-virtual {p1}, Lcom/google/android/gms/internal/common/zza;->zza()Landroid/os/Parcel;

    .line 76
    .line 77
    .line 78
    move-result-object p5

    .line 79
    invoke-virtual {p1, p2, p5}, Lcom/google/android/gms/internal/common/zza;->zzB(ILandroid/os/Parcel;)Landroid/os/Parcel;

    .line 80
    .line 81
    .line 82
    move-result-object p1

    .line 83
    sget-object p2, Landroid/accounts/Account;->CREATOR:Landroid/os/Parcelable$Creator;

    .line 84
    .line 85
    invoke-static {p1, p2}, Lcom/google/android/gms/internal/common/zzc;->zza(Landroid/os/Parcel;Landroid/os/Parcelable$Creator;)Landroid/os/Parcelable;

    .line 86
    .line 87
    .line 88
    move-result-object p2

    .line 89
    check-cast p2, Landroid/accounts/Account;

    .line 90
    .line 91
    invoke-virtual {p1}, Landroid/os/Parcel;->recycle()V
    :try_end_0
    .catch Landroid/os/RemoteException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 92
    .line 93
    .line 94
    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 95
    .line 96
    .line 97
    goto :goto_4

    .line 98
    :catchall_0
    move-exception p1

    .line 99
    goto :goto_2

    .line 100
    :catch_0
    :try_start_1
    const-string p1, "AccountAccessor"

    .line 101
    .line 102
    const-string p2, "Remote account accessor probably died"

    .line 103
    .line 104
    invoke-static {p1, p2}, Landroid/util/Log;->w(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 105
    .line 106
    .line 107
    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 108
    .line 109
    .line 110
    goto :goto_3

    .line 111
    :goto_2
    invoke-static {p3, p4}, Landroid/os/Binder;->restoreCallingIdentity(J)V

    .line 112
    .line 113
    .line 114
    throw p1

    .line 115
    :cond_6
    :goto_3
    const/4 p2, 0x0

    .line 116
    :goto_4
    iput-object p2, p0, Lcom/google/android/gms/common/internal/j;->y:Landroid/accounts/Account;

    .line 117
    .line 118
    goto :goto_5

    .line 119
    :cond_7
    iput-object p5, p0, Lcom/google/android/gms/common/internal/j;->e:Landroid/os/IBinder;

    .line 120
    .line 121
    iput-object p8, p0, Lcom/google/android/gms/common/internal/j;->y:Landroid/accounts/Account;

    .line 122
    .line 123
    :goto_5
    iput-object p6, p0, Lcom/google/android/gms/common/internal/j;->f:[Lcom/google/android/gms/common/api/Scope;

    .line 124
    .line 125
    iput-object p7, p0, Lcom/google/android/gms/common/internal/j;->x:Landroid/os/Bundle;

    .line 126
    .line 127
    iput-object p9, p0, Lcom/google/android/gms/common/internal/j;->z:[Lb5/c;

    .line 128
    .line 129
    iput-object p10, p0, Lcom/google/android/gms/common/internal/j;->A:[Lb5/c;

    .line 130
    .line 131
    iput-boolean p11, p0, Lcom/google/android/gms/common/internal/j;->B:Z

    .line 132
    .line 133
    iput p12, p0, Lcom/google/android/gms/common/internal/j;->C:I

    .line 134
    .line 135
    iput-boolean p13, p0, Lcom/google/android/gms/common/internal/j;->D:Z

    .line 136
    .line 137
    iput-object p14, p0, Lcom/google/android/gms/common/internal/j;->E:Ljava/lang/String;

    .line 138
    .line 139
    return-void
.end method


# virtual methods
.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 0

    .line 1
    invoke-static {p0, p1, p2}, Lcom/google/android/gms/common/api/y;->a(Lcom/google/android/gms/common/internal/j;Landroid/os/Parcel;I)V

    .line 2
    .line 3
    .line 4
    return-void
.end method
