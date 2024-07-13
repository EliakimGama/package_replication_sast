// Technique: GENERATED KNOWLEDGE
// Template: <Previous knowledge> Considering this knowledge above, generate <tool or testing type> tests for the target
// Example: Iteration one: Which are the good practices for JEST unit tests. Iteration two: Considering this knowledge above, generate unit tests for the component

import React from 'react';
import { render, fireEvent } from '@testing-library/react';
import Calculator from './Calculator';

describe('Calculator Component', () => {
  it('should add two numbers correctly', () => {
    const { getByText, getByDisplayValue } = render(<Calculator />);
    
    fireEvent.change(getByDisplayValue('0'), { target: { value: '5' } });
    fireEvent.change(getByDisplayValue('0'), { target: { value: '3' } });
    
    fireEvent.click(getByText('Add'));
    
    expect(getByText('Result: 8')).toBeInTheDocument();
  });

  it('should subtract two numbers correctly', () => {
    const { getByText, getByDisplayValue } = render(<Calculator />);
    
    fireEvent.change(getByDisplayValue('0'), { target: { value: '5' } });
    fireEvent.change(getByDisplayValue('0'), { target: { value: '3' } });
    
    fireEvent.click(getByText('Subtract'));
    
    expect(getByText('Result: 2')).toBeInTheDocument();
  });

  it('should multiply two numbers correctly', () => {
    const { getByText, getByDisplayValue } = render(<Calculator />);
    
    fireEvent.change(getByDisplayValue('0'), { target: { value: '5' } });
    fireEvent.change(getByDisplayValue('0'), { target: { value: '3' } });
    
    fireEvent.click(getByText('Multiply'));
    
    expect(getByText('Result: 15')).toBeInTheDocument();
  });

  it('should divide two numbers correctly', () => {
    const { getByText, getByDisplayValue } = render(<Calculator />);
    
    fireEvent.change(getByDisplayValue('0'), { target: { value: '6' } });
    fireEvent.change(getByDisplayValue('0'), { target: { value: '3' } });
    
    fireEvent.click(getByText('Divide'));
    
    expect(getByText('Result: 2')).toBeInTheDocument();
  });

  it('should handle division by zero correctly', () => {
    const { getByText, getByDisplayValue } = render(<Calculator />);
    
    fireEvent.change(getByDisplayValue('0'), { target: { value: '6' } });
    fireEvent.change(getByDisplayValue('0'), { target: { value: '0' } });
    
    fireEvent.click(getByText('Divide'));
    
    expect(getByText('Result: Error')).toBeInTheDocument();
  });
});