from kivy.app import App
from kivy.lang import Builder
from kivy.utils import platform
if platform == "android":
    from jnius import autoclass
    # from android.runnable import run_on_ui_thread
    from android import python_act as PythonActivity
    from googleplayapi import BillingProcessor

    Toast = autoclass('android.widget.Toast')
    String = autoclass('java.lang.String')
    CharSequence = autoclass('java.lang.CharSequence')
    # Find your app 's license key
    #1-Open Play Console and select the app.
    #2-Go to the Monetization setup page(Monetize > Monetization setup).
    # Your license key is under "Licensing."
    LICENSE_KEY = "Your license key"
    context = PythonActivity.mActivity
    PROD_ONETIME_0 = "Item1"
    PROD_ONETIME_1 = "Item2"
    PROD_ONETIME_2 = "Item3"
    products = [PROD_ONETIME_0, PROD_ONETIME_1, PROD_ONETIME_2]

kv_string = '''
FloatLayout:
    Button:
        text: 'Buy   Item 1'
        size_hint: None, None
        size: 350, 150
        pos_hint: {'center_x': 0.5, 'center_y': 0.7}
        on_release: app.purchase_product('Item1')

    Button:
        text: 'Buy   Item 2'
        size_hint: None, None
        size: 350, 150
        pos_hint: {'center_x': 0.5, 'center_y': 0.5}
        on_release: app.purchase_product('Item2')

    Button:
        text: 'Buy   Item 3'
        size_hint: None, None
        size: 350, 150
        pos_hint: {'center_x': 0.5, 'center_y': 0.3}
        on_release: app.purchase_product('Item3')
'''

class ProductPurchaseApp(App):
    def build(self):
        if platform == "android":
            self.bp = BillingProcessor(context, LICENSE_KEY)
        return Builder.load_string(kv_string)


    def purchase_product(self, product_id):
        if platform == "android":
            if product_id in products:
                self.bp.launch_billing_flow(product_id)

    def on_pause(self):
        return True

    def on_resume(self):
        pass

if __name__ == '__main__':
    ProductPurchaseApp().run()
