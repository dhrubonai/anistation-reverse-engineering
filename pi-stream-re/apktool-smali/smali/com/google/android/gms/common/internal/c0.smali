.class public final Lcom/google/android/gms/common/internal/c0;
.super Lc5/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/common/internal/c0;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field public final a:I

.field public final b:Landroid/os/IBinder;

.field public final c:Lb5/a;

.field public final d:Z

.field public final e:Z


# direct methods
.method public static constructor <clinit>()V
    .locals 2

    new-instance v0, Lcom/google/android/gms/common/api/y;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lcom/google/android/gms/common/api/y;-><init>(I)V

    sput-object v0, Lcom/google/android/gms/common/internal/c0;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILandroid/os/IBinder;Lb5/a;ZZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    .line 2
    .line 3
    .line 4
    iput p1, p0, Lcom/google/android/gms/common/internal/c0;->a:I

    .line 5
    .line 6
    iput-object p2, p0, Lcom/google/android/gms/common/internal/c0;->b:Landroid/os/IBinder;

    .line 7
    .line 8
    iput-object p3, p0, Lcom/google/android/gms/common/internal/c0;->c:Lb5/a;

    .line 9
    .line 10
    iput-boolean p4, p0, Lcom/google/android/gms/common/internal/c0;->d:Z

    .line 11
    .line 12
    iput-boolean p5, p0, Lcom/google/android/gms/common/internal/c0;->e:Z

    .line 13
    .line 14
    return-void
.end method


# virtual methods
.method public final equals(Ljava/lang/Object;)Z
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    if-nez p1, :cond_0

    .line 3
    .line 4
    return v0

    .line 5
    :cond_0
    const/4 v1, 0x1

    .line 6
    if-ne p0, p1, :cond_1

    .line 7
    .line 8
    return v1

    .line 9
    :cond_1
    instance-of v2, p1, Lcom/google/android/gms/common/internal/c0;

    .line 10
    .line 11
    if-nez v2, :cond_2

    .line 12
    .line 13
    return v0

    .line 14
    :cond_2
    check-cast p1, Lcom/google/android/gms/common/internal/c0;

    .line 15
    .line 16
    iget-object v2, p0, Lcom/google/android/gms/common/internal/c0;->c:Lb5/a;

    .line 17
    .line 18
    iget-object v3, p1, Lcom/google/android/gms/common/internal/c0;->c:Lb5/a;

    .line 19
    .line 20
    invoke-virtual {v2, v3}, Lb5/a;->equals(Ljava/lang/Object;)Z

    .line 21
    .line 22
    .line 23
    move-result v2

    .line 24
    if-eqz v2, :cond_7

    .line 25
    .line 26
    const/4 v2, 0x0

    .line 27
    const-string v3, "com.google.android.gms.common.internal.IAccountAccessor"

    .line 28
    .line 29
    iget-object v4, p0, Lcom/google/android/gms/common/internal/c0;->b:Landroid/os/IBinder;

    .line 30
    .line 31
    if-nez v4, :cond_3

    .line 32
    .line 33
    move-object v5, v2

    .line 34
    goto :goto_0

    .line 35
    :cond_3
    sget v5, Lcom/google/android/gms/common/internal/a;->a:I

    .line 36
    .line 37
    invoke-interface {v4, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 38
    .line 39
    .line 40
    move-result-object v5

    .line 41
    instance-of v6, v5, Lcom/google/android/gms/common/internal/m;

    .line 42
    .line 43
    if-eqz v6, :cond_4

    .line 44
    .line 45
    check-cast v5, Lcom/google/android/gms/common/internal/m;

    .line 46
    .line 47
    goto :goto_0

    .line 48
    :cond_4
    new-instance v5, Lcom/google/android/gms/common/internal/s0;

    .line 49
    .line 50
    invoke-direct {v5, v4}, Lcom/google/android/gms/common/internal/s0;-><init>(Landroid/os/IBinder;)V

    .line 51
    .line 52
    .line 53
    :goto_0
    iget-object p1, p1, Lcom/google/android/gms/common/internal/c0;->b:Landroid/os/IBinder;

    .line 54
    .line 55
    if-nez p1, :cond_5

    .line 56
    .line 57
    goto :goto_1

    .line 58
    :cond_5
    sget v2, Lcom/google/android/gms/common/internal/a;->a:I

    .line 59
    .line 60
    invoke-interface {p1, v3}, Landroid/os/IBinder;->queryLocalInterface(Ljava/lang/String;)Landroid/os/IInterface;

    .line 61
    .line 62
    .line 63
    move-result-object v2

    .line 64
    instance-of v3, v2, Lcom/google/android/gms/common/internal/m;

    .line 65
    .line 66
    if-eqz v3, :cond_6

    .line 67
    .line 68
    check-cast v2, Lcom/google/android/gms/common/internal/m;

    .line 69
    .line 70
    goto :goto_1

    .line 71
    :cond_6
    new-instance v2, Lcom/google/android/gms/common/internal/s0;

    .line 72
    .line 73
    invoke-direct {v2, p1}, Lcom/google/android/gms/common/internal/s0;-><init>(Landroid/os/IBinder;)V

    .line 74
    .line 75
    .line 76
    :goto_1
    invoke-static {v5, v2}, Lp7/a0;->q(Ljava/lang/Object;Ljava/lang/Object;)Z

    .line 77
    .line 78
    .line 79
    move-result p1

    .line 80
    if-eqz p1, :cond_7

    .line 81
    .line 82
    return v1

    .line 83
    :cond_7
    return v0
.end method

.method public final writeToParcel(Landroid/os/Parcel;I)V
    .locals 4

    .line 1
    const/16 v0, 0x4f45

    .line 2
    .line 3
    invoke-static {v0, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x1

    .line 8
    iget v2, p0, Lcom/google/android/gms/common/internal/c0;->a:I

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    iget-object v1, p0, Lcom/google/android/gms/common/internal/c0;->b:Landroid/os/IBinder;

    .line 14
    .line 15
    if-nez v1, :cond_0

    .line 16
    .line 17
    goto :goto_0

    .line 18
    :cond_0
    const/4 v2, 0x2

    .line 19
    invoke-static {v2, p1}, Lp7/a0;->t0(ILandroid/os/Parcel;)I

    .line 20
    .line 21
    .line 22
    move-result v2

    .line 23
    invoke-virtual {p1, v1}, Landroid/os/Parcel;->writeStrongBinder(Landroid/os/IBinder;)V

    .line 24
    .line 25
    .line 26
    invoke-static {v2, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 27
    .line 28
    .line 29
    :goto_0
    const/4 v1, 0x3

    .line 30
    iget-object v2, p0, Lcom/google/android/gms/common/internal/c0;->c:Lb5/a;

    .line 31
    .line 32
    const/4 v3, 0x0

    .line 33
    invoke-static {p1, v1, v2, p2, v3}, Lp7/a0;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 34
    .line 35
    .line 36
    const/4 p2, 0x4

    .line 37
    iget-boolean v1, p0, Lcom/google/android/gms/common/internal/c0;->d:Z

    .line 38
    .line 39
    invoke-static {p1, p2, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 40
    .line 41
    .line 42
    const/4 p2, 0x5

    .line 43
    iget-boolean v1, p0, Lcom/google/android/gms/common/internal/c0;->e:Z

    .line 44
    .line 45
    invoke-static {p1, p2, v1}, Lp7/a0;->d0(Landroid/os/Parcel;IZ)V

    .line 46
    .line 47
    .line 48
    invoke-static {v0, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 49
    .line 50
    .line 51
    return-void
.end method
