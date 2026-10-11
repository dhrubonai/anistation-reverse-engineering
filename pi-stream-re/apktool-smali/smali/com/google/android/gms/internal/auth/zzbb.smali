.class public final Lcom/google/android/gms/internal/auth/zzbb;
.super Lc5/a;
.source "SourceFile"


# static fields
.field public static final CREATOR:Landroid/os/Parcelable$Creator;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Landroid/os/Parcelable$Creator<",
            "Lcom/google/android/gms/internal/auth/zzbb;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field final zza:I

.field public final zzb:Ljava/lang/String;

.field public final zzc:Landroid/app/PendingIntent;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    new-instance v0, Lcom/google/android/gms/internal/auth/zzbc;

    invoke-direct {v0}, Lcom/google/android/gms/internal/auth/zzbc;-><init>()V

    sput-object v0, Lcom/google/android/gms/internal/auth/zzbb;->CREATOR:Landroid/os/Parcelable$Creator;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Landroid/app/PendingIntent;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Lc5/a;-><init>()V

    const/4 p1, 0x1

    iput p1, p0, Lcom/google/android/gms/internal/auth/zzbb;->zza:I

    .line 2
    invoke-static {p2}, Lw7/b;->s(Ljava/lang/Object;)V

    iput-object p2, p0, Lcom/google/android/gms/internal/auth/zzbb;->zzb:Ljava/lang/String;

    .line 3
    invoke-static {p3}, Lw7/b;->s(Ljava/lang/Object;)V

    iput-object p3, p0, Lcom/google/android/gms/internal/auth/zzbb;->zzc:Landroid/app/PendingIntent;

    return-void
.end method

.method public constructor <init>(Ljava/lang/String;Landroid/app/PendingIntent;)V
    .locals 1

    const/4 v0, 0x1

    .line 4
    invoke-direct {p0, v0, p1, p2}, Lcom/google/android/gms/internal/auth/zzbb;-><init>(ILjava/lang/String;Landroid/app/PendingIntent;)V

    return-void
.end method


# virtual methods
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
    iget v2, p0, Lcom/google/android/gms/internal/auth/zzbb;->zza:I

    .line 9
    .line 10
    invoke-static {p1, v1, v2}, Lp7/a0;->h0(Landroid/os/Parcel;II)V

    .line 11
    .line 12
    .line 13
    const/4 v1, 0x2

    .line 14
    iget-object v2, p0, Lcom/google/android/gms/internal/auth/zzbb;->zzb:Ljava/lang/String;

    .line 15
    .line 16
    const/4 v3, 0x0

    .line 17
    invoke-static {p1, v1, v2, v3}, Lp7/a0;->n0(Landroid/os/Parcel;ILjava/lang/String;Z)V

    .line 18
    .line 19
    .line 20
    const/4 v1, 0x3

    .line 21
    iget-object v2, p0, Lcom/google/android/gms/internal/auth/zzbb;->zzc:Landroid/app/PendingIntent;

    .line 22
    .line 23
    invoke-static {p1, v1, v2, p2, v3}, Lp7/a0;->m0(Landroid/os/Parcel;ILandroid/os/Parcelable;IZ)V

    .line 24
    .line 25
    .line 26
    invoke-static {v0, p1}, Lp7/a0;->u0(ILandroid/os/Parcel;)V

    .line 27
    .line 28
    .line 29
    return-void
.end method
