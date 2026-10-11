.class public final synthetic Landroidx/activity/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lb/b;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Landroidx/activity/j;


# direct methods
.method public synthetic constructor <init>(Landroidx/fragment/app/b0;I)V
    .locals 0

    .line 1
    iput p2, p0, Landroidx/activity/d;->a:I

    .line 2
    .line 3
    iput-object p1, p0, Landroidx/activity/d;->b:Landroidx/activity/j;

    .line 4
    .line 5
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 6
    .line 7
    .line 8
    return-void
.end method


# virtual methods
.method public final a(Landroid/content/Context;)V
    .locals 1

    .line 1
    iget p1, p0, Landroidx/activity/d;->a:I

    iget-object v0, p0, Landroidx/activity/d;->b:Landroidx/activity/j;

    packed-switch p1, :pswitch_data_0

    goto :goto_0

    :pswitch_0
    invoke-static {v0}, Landroidx/activity/j;->d(Landroidx/activity/j;)V

    return-void

    :goto_0
    check-cast v0, Landroidx/fragment/app/b0;

    invoke-static {v0}, Landroidx/fragment/app/b0;->h(Landroidx/fragment/app/b0;)V

    return-void

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
.end method
