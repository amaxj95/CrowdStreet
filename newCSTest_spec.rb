# Generated by Selenium IDE
require 'selenium-webdriver'
require 'json'
describe 'NewCSTest' do
  before(:each) do
    @driver = Selenium::WebDriver.for(:remote, url: 'http://localhost:8080/wd/hub', desired_capabilities: Selenium::WebDriver::Remote::Capabilities.chrome)
    @vars = {}
  end
  after(:each) do
    @driver.quit
  end
  it 'newCSTest' do
    # Test name: newCSTest
    # Step # | name | target | value
    # 1 | open | http://test.crowdstreet.com | 
    @driver.get('http://test.crowdstreet.com')
    # 2 | click | css=.tablet-menu > .join-button | 
    @driver.find_element(:css, '.tablet-menu > .join-button').click
    # 3 | type | id=firstName | AUTOMATED
    @driver.find_element(:id, 'firstName').send_keys('AUTOMATED')
    # 4 | type | id=lastName | TEST
    @driver.find_element(:id, 'lastName').send_keys('TEST')
    # 5 | type | id=email | amaxj95@gmail.com
    @driver.find_element(:id, 'email').send_keys('amaxj95@gmail.com')
    # 6 | type | id=password | db!ppQer5TTtA56
    @driver.find_element(:id, 'password').send_keys('db!ppQer5TTtA56')
    # 7 | type | id=confirmPassword | db!ppQer5TTtA56
    @driver.find_element(:id, 'confirmPassword').send_keys('db!ppQer5TTtA56')
    # 8 | click | id=accreditedYes | 
    @driver.find_element(:id, 'accreditedYes').click
    # 9 | click | id=hasAgreedTos | 
    @driver.find_element(:id, 'hasAgreedTos').click
    # 10 | click | css=.h-14 | 
    @driver.find_element(:css, '.h-14').click
    # 11 | click | css=button | 
    @driver.find_element(:css, 'button').click
    # 12 | close |  | 
    @driver.close
  end
end
